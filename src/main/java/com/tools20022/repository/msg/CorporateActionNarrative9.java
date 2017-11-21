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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the information conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmAdditionalText
 * CorporateActionNarrative9.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmInformationConditions
 * CorporateActionNarrative9.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmInformationToComplyWith
 * CorporateActionNarrative9.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmPartyContactNarrative
 * CorporateActionNarrative9.mmPartyContactNarrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the information conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionNarrative9", propOrder = {"additionalText", "informationConditions", "informationToComplyWith", "partyContactNarrative"})
public class CorporateActionNarrative9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max350Text> additionalText;
	/**
	 * Provides additional information or specifies in more detail the content
	 * of a message. This field may only be used when the information to be
	 * transmitted, cannot be coded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9
	 * CorporateActionNarrative9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative9.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> informationConditions;
	/**
	 * Provides conditional information related to the event, for example, an
	 * offer is subject to 50 percent acceptance, the offeror allows the
	 * securities holder to set some conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9
	 * CorporateActionNarrative9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformationConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> CorporateActionNarrative9.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> informationToComplyWith;
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, for example, not open to US/Canadian residents, Qualified
	 * Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9
	 * CorporateActionNarrative9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformationToComplyWith = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> CorporateActionNarrative9.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or Sophisticated Investor Letter (SIL) to be provided.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> partyContactNarrative;
	/**
	 * Provides additional information regarding the party, for example, the
	 * contact unit or person responsible for the transaction identified in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9
	 * CorporateActionNarrative9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyContactNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyContactNarrative = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> CorporateActionNarrative9.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNarrative9.mmAdditionalText, CorporateActionNarrative9.mmInformationConditions, CorporateActionNarrative9.mmInformationToComplyWith,
						CorporateActionNarrative9.mmPartyContactNarrative);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionNarrative9";
				definition = "Provides additional information such as the information conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AddtlTxt")
	public List<Max350Text> getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(List<Max350Text> additionalText) {
		this.additionalText = additionalText;
	}

	@XmlElement(name = "InfConds")
	public List<Max350Text> getInformationConditions() {
		return informationConditions;
	}

	public void setInformationConditions(List<Max350Text> informationConditions) {
		this.informationConditions = informationConditions;
	}

	@XmlElement(name = "InfToCmplyWth")
	public List<Max350Text> getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(List<Max350Text> informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	@XmlElement(name = "PtyCtctNrrtv")
	public List<Max350Text> getPartyContactNarrative() {
		return partyContactNarrative;
	}

	public void setPartyContactNarrative(List<Max350Text> partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
	}
}