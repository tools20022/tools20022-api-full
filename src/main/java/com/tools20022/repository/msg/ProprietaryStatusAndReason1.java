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
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the proprietary status and reason of an instruction or an
 * instruction cancellation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryStatus
 * ProprietaryStatusAndReason1.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryReason
 * ProprietaryStatusAndReason1.mmProprietaryReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "ProprietaryStatusAndReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the proprietary status and reason of an instruction or an instruction cancellation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
 * ProprietaryStatusAndReason6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProprietaryStatusAndReason1", propOrder = {"proprietaryStatus", "proprietaryReason"})
public class ProprietaryStatusAndReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification20 proprietaryStatus;
	/**
	 * Proprietary identification of the status related to an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the status related to an instruction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryStatus
	 * ProprietaryStatusAndReason6.mmProprietaryStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> ProprietaryStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary identification of the status related to an instruction.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryStatusAndReason6.mmProprietaryStatus);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification20.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ProprietaryReason1> proprietaryReason;
	/**
	 * Proprietary identification of the reason related to a proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the reason related to a proprietary status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryReason
	 * ProprietaryStatusAndReason6.mmProprietaryReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> ProprietaryStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "PrtryRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryReason";
			definition = "Proprietary identification of the reason related to a proprietary status.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryStatusAndReason6.mmProprietaryReason);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProprietaryReason1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmProprietaryStatus, ProprietaryStatusAndReason1.mmProprietaryReason);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProprietaryStatusAndReason1";
				definition = "Provides the proprietary status and reason of an instruction or an instruction cancellation.";
				nextVersions_lazy = () -> Arrays.asList(ProprietaryStatusAndReason6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrtrySts", required = true)
	public GenericIdentification20 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public void setProprietaryStatus(com.tools20022.repository.msg.GenericIdentification20 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
	}

	@XmlElement(name = "PrtryRsn")
	public List<ProprietaryReason1> getProprietaryReason() {
		return proprietaryReason;
	}

	public void setProprietaryReason(List<com.tools20022.repository.msg.ProprietaryReason1> proprietaryReason) {
		this.proprietaryReason = proprietaryReason;
	}
}