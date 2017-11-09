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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of partners involved in exchange from the merchant to the
 * issuer, with the relative timestamp of their exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability5#mmRelayIdentification
 * Traceability5.mmRelayIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability5#mmProtocolName
 * Traceability5.mmProtocolName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability5#mmProtocolVersion
 * Traceability5.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability5#mmTraceDateTimeIn
 * Traceability5.mmTraceDateTimeIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability5#mmTraceDateTimeOut
 * Traceability5.mmTraceDateTimeOut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Traceability5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Traceability2
 * Traceability2}</li>
 * </ul>
 */
public class Traceability5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification76 relayIdentification;
	/**
	 * Identification of a partner of a message exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76
	 * GenericIdentification76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability5 Traceability5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RlayId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelayIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a partner of a message exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Traceability2#mmRelayIdentification
	 * Traceability2.mmRelayIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelayIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Traceability5.mmObject();
			isDerived = false;
			xmlTag = "RlayId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelayIdentification";
			definition = "Identification of a partner of a message exchange.";
			previousVersion_lazy = () -> Traceability2.mmRelayIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification76.mmObject();
		}
	};
	protected Max35Text protocolName;
	/**
	 * Name of the outgoing protocol used by the node.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability5 Traceability5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcolNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the outgoing protocol used by the node."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtocolName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability5.mmObject();
			isDerived = false;
			xmlTag = "PrtcolNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolName";
			definition = "Name of the outgoing protocol used by the node.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max6Text protocolVersion;
	/**
	 * Version of the protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability5 Traceability5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcolVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the protocol."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability5.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the protocol.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected ISODateTime traceDateTimeIn;
	/**
	 * Date and time of incoming data exchange for relaying or processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability5 Traceability5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of incoming data exchange for relaying or processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Traceability2#mmTraceDateTimeIn
	 * Traceability2.mmTraceDateTimeIn}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceDateTimeIn = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability5.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeIn";
			definition = "Date and time of incoming data exchange for relaying or processing.";
			previousVersion_lazy = () -> Traceability2.mmTraceDateTimeIn;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime traceDateTimeOut;
	/**
	 * Date and time of the outgoing exchange for relaying or processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability5 Traceability5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the outgoing exchange for relaying or processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Traceability2#mmTraceDateTimeOut
	 * Traceability2.mmTraceDateTimeOut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceDateTimeOut = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability5.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmOut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeOut";
			definition = "Date and time of the outgoing exchange for relaying or processing.";
			previousVersion_lazy = () -> Traceability2.mmTraceDateTimeOut;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Traceability5.mmRelayIdentification, Traceability5.mmProtocolName, Traceability5.mmProtocolVersion, Traceability5.mmTraceDateTimeIn, Traceability5.mmTraceDateTimeOut);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Traceability5";
				definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
				previousVersion_lazy = () -> Traceability2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification76 getRelayIdentification() {
		return relayIdentification;
	}

	public void setRelayIdentification(com.tools20022.repository.msg.GenericIdentification76 relayIdentification) {
		this.relayIdentification = relayIdentification;
	}

	public Max35Text getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(Max35Text protocolName) {
		this.protocolName = protocolName;
	}

	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	public ISODateTime getTraceDateTimeIn() {
		return traceDateTimeIn;
	}

	public void setTraceDateTimeIn(ISODateTime traceDateTimeIn) {
		this.traceDateTimeIn = traceDateTimeIn;
	}

	public ISODateTime getTraceDateTimeOut() {
		return traceDateTimeOut;
	}

	public void setTraceDateTimeOut(ISODateTime traceDateTimeOut) {
		this.traceDateTimeOut = traceDateTimeOut;
	}
}