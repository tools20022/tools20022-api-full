/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NetworkParameters5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters to synchronise a real time clock.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation2#mmPOITimeZone
 * ClockSynchronisation2.mmPOITimeZone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation2#mmSynchronisationServer
 * ClockSynchronisation2.mmSynchronisationServer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClockSynchronisation2#mmDelay
 * ClockSynchronisation2.mmDelay}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClockSynchronisation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters to synchronise a real time clock."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation1
 * ClockSynchronisation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClockSynchronisation2", propOrder = {"pOITimeZone", "synchronisationServer", "delay"})
public class ClockSynchronisation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POITmZone", required = true)
	protected Max70Text pOITimeZone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation2
	 * ClockSynchronisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POITmZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POITimeZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the time zone where is located the POI (Point Of Interaction), as definined by the IANA (Internet Assigned Number Authority) time zone data base."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation1#mmPOITimeZone
	 * ClockSynchronisation1.mmPOITimeZone}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClockSynchronisation2, Max70Text> mmPOITimeZone = new MMMessageAttribute<ClockSynchronisation2, Max70Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClockSynchronisation2.mmObject();
			isDerived = false;
			xmlTag = "POITmZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POITimeZone";
			definition = "Name of the time zone where is located the POI (Point Of Interaction), as definined by the IANA (Internet Assigned Number Authority) time zone data base.";
			previousVersion_lazy = () -> ClockSynchronisation1.mmPOITimeZone;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(ClockSynchronisation2 obj) {
			return obj.getPOITimeZone();
		}

		@Override
		public void setValue(ClockSynchronisation2 obj, Max70Text value) {
			obj.setPOITimeZone(value);
		}
	};
	@XmlElement(name = "SynctnSvr")
	protected List<NetworkParameters5> synchronisationServer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters5
	 * NetworkParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation2
	 * ClockSynchronisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SynctnSvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SynchronisationServer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters to contact a time server."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation1#mmSynchronisationServer
	 * ClockSynchronisation1.mmSynchronisationServer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClockSynchronisation2, List<NetworkParameters5>> mmSynchronisationServer = new MMMessageAssociationEnd<ClockSynchronisation2, List<NetworkParameters5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClockSynchronisation2.mmObject();
			isDerived = false;
			xmlTag = "SynctnSvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SynchronisationServer";
			definition = "Parameters to contact a time server.";
			previousVersion_lazy = () -> ClockSynchronisation1.mmSynchronisationServer;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters5.mmObject();
		}

		@Override
		public List<NetworkParameters5> getValue(ClockSynchronisation2 obj) {
			return obj.getSynchronisationServer();
		}

		@Override
		public void setValue(ClockSynchronisation2 obj, List<NetworkParameters5> value) {
			obj.setSynchronisationServer(value);
		}
	};
	@XmlElement(name = "Dely")
	protected ISOTime delay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClockSynchronisation2
	 * ClockSynchronisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dely"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delay between two contacts of the server."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClockSynchronisation2, Optional<ISOTime>> mmDelay = new MMMessageAttribute<ClockSynchronisation2, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClockSynchronisation2.mmObject();
			isDerived = false;
			xmlTag = "Dely";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delay";
			definition = "Delay between two contacts of the server.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(ClockSynchronisation2 obj) {
			return obj.getDelay();
		}

		@Override
		public void setValue(ClockSynchronisation2 obj, Optional<ISOTime> value) {
			obj.setDelay(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClockSynchronisation2.mmPOITimeZone, com.tools20022.repository.msg.ClockSynchronisation2.mmSynchronisationServer,
						com.tools20022.repository.msg.ClockSynchronisation2.mmDelay);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClockSynchronisation2";
				definition = "Parameters to synchronise a real time clock.";
				previousVersion_lazy = () -> ClockSynchronisation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getPOITimeZone() {
		return pOITimeZone;
	}

	public ClockSynchronisation2 setPOITimeZone(Max70Text pOITimeZone) {
		this.pOITimeZone = Objects.requireNonNull(pOITimeZone);
		return this;
	}

	public List<NetworkParameters5> getSynchronisationServer() {
		return synchronisationServer == null ? synchronisationServer = new ArrayList<>() : synchronisationServer;
	}

	public ClockSynchronisation2 setSynchronisationServer(List<NetworkParameters5> synchronisationServer) {
		this.synchronisationServer = Objects.requireNonNull(synchronisationServer);
		return this;
	}

	public Optional<ISOTime> getDelay() {
		return delay == null ? Optional.empty() : Optional.of(delay);
	}

	public ClockSynchronisation2 setDelay(ISOTime delay) {
		this.delay = delay;
		return this;
	}
}