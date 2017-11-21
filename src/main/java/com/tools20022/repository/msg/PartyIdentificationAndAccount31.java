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
import com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03;
import com.tools20022.repository.area.secl.TradeLegNotificationV03;
import com.tools20022.repository.choice.PartyIdentification33Choice;
import com.tools20022.repository.entity.ClearingMemberRole;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party and account details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmIdentification
 * PartyIdentificationAndAccount31.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmAlternateIdentification
 * PartyIdentificationAndAccount31.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmAdditionalInformation
 * PartyIdentificationAndAccount31.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmClearingAccount
 * PartyIdentificationAndAccount31.mmClearingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmNonClearingMember
 * TradeLegNotificationV03.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmNonClearingMember
 * TradeLegNotificationCancellationV03.mmNonClearingMember}</li>
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
 * "PartyIdentificationAndAccount31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party and account details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentificationAndAccount31", propOrder = {"identification", "alternateIdentification", "additionalInformation", "clearingAccount"})
public class PartyIdentificationAndAccount31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification33Choice identification;
	/**
	 * Identification of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentificationAndAccount31.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification33Choice.mmObject();
		}
	};
	protected AlternatePartyIdentification4 alternateIdentification;
	/**
	 * Alternate identification for a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4
	 * AlternatePartyIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alternate identification for a party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAlternateIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentificationAndAccount31.mmObject();
			isDerived = false;
			xmlTag = "AltrnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateIdentification";
			definition = "Alternate identification for a party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlternatePartyIdentification4.mmObject();
		}
	};
	protected PartyTextInformation1 additionalInformation;
	/**
	 * Provides additional information to a party identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyTextInformation1
	 * PartyTextInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information to a party identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyIdentificationAndAccount31.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information to a party identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyTextInformation1.mmObject();
		}
	};
	protected SecuritiesAccount18 clearingAccount;
	/**
	 * Identifies the clearing member account at the Central counterparty
	 * through which the trade must be cleared (sometimes called position
	 * account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount18
	 * SecuritiesAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the Central counterparty through which the trade must be cleared (sometimes called position account)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmClearingAccount;
			componentContext_lazy = () -> PartyIdentificationAndAccount31.mmObject();
			isDerived = false;
			xmlTag = "ClrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the Central counterparty through which the trade must be cleared (sometimes called position account).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentificationAndAccount31.mmIdentification, PartyIdentificationAndAccount31.mmAlternateIdentification, PartyIdentificationAndAccount31.mmAdditionalInformation,
						PartyIdentificationAndAccount31.mmClearingAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(TradeLegNotificationV03.mmNonClearingMember, TradeLegNotificationCancellationV03.mmNonClearingMember);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationAndAccount31";
				definition = "Party and account details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public PartyIdentification33Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification33Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AltrnId")
	public AlternatePartyIdentification4 getAlternateIdentification() {
		return alternateIdentification;
	}

	public void setAlternateIdentification(com.tools20022.repository.msg.AlternatePartyIdentification4 alternateIdentification) {
		this.alternateIdentification = alternateIdentification;
	}

	@XmlElement(name = "AddtlInf")
	public PartyTextInformation1 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(com.tools20022.repository.msg.PartyTextInformation1 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "ClrAcct")
	public SecuritiesAccount18 getClearingAccount() {
		return clearingAccount;
	}

	public void setClearingAccount(com.tools20022.repository.msg.SecuritiesAccount18 clearingAccount) {
		this.clearingAccount = clearingAccount;
	}
}