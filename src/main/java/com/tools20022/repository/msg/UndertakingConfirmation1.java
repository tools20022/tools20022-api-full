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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Confirmation information for the issued undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#mmConfirmer
 * UndertakingConfirmation1.mmConfirmer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#mmReferenceNumber
 * UndertakingConfirmation1.mmReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#mmDate
 * UndertakingConfirmation1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#mmConfirmation
 * UndertakingConfirmation1.mmConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
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
 * "UndertakingConfirmation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Confirmation information for the issued undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UndertakingConfirmation1", propOrder = {"confirmer", "referenceNumber", "date", "confirmation"})
public class UndertakingConfirmation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification43 confirmer;
	/**
	 * Party that adds its undertaking to honour the undertaking or amendment of
	 * the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
	 * UndertakingConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnfrmr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that adds its undertaking to honour the undertaking or amendment of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConfirmer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> UndertakingConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "Cnfrmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmer";
			definition = "Party that adds its undertaking to honour the undertaking or amendment of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected Max35Text referenceNumber;
	/**
	 * Unique and unambiguous identifier assigned by the confirmer to the
	 * undertaking.
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
	 * UndertakingConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the confirmer to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UndertakingConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "RefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the confirmer to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice date;
	/**
	 * Date and time when the undertaking or amendment of the undertaking was
	 * confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmDateOfAdvice
	 * Undertaking.mmDateOfAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
	 * UndertakingConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when the undertaking or amendment of the undertaking was confirmed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmDateOfAdvice;
			componentContext_lazy = () -> UndertakingConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date and time when the undertaking or amendment of the undertaking was confirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected List<Max2000Text> confirmation;
	/**
	 * Confirmation of the undertaking or amendment of the confirmed
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
	 * UndertakingConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the undertaking or amendment of the confirmed undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UndertakingConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Confirmation of the undertaking or amendment of the confirmed undertaking.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UndertakingConfirmation1.mmConfirmer, UndertakingConfirmation1.mmReferenceNumber, UndertakingConfirmation1.mmDate, UndertakingConfirmation1.mmConfirmation);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingConfirmation1";
				definition = "Confirmation information for the issued undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cnfrmr", required = true)
	public PartyIdentification43 getConfirmer() {
		return confirmer;
	}

	public void setConfirmer(com.tools20022.repository.msg.PartyIdentification43 confirmer) {
		this.confirmer = confirmer;
	}

	@XmlElement(name = "RefNb", required = true)
	public Max35Text getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(Max35Text referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	@XmlElement(name = "Dt", required = true)
	public DateAndDateTimeChoice getDate() {
		return date;
	}

	public void setDate(DateAndDateTimeChoice date) {
		this.date = date;
	}

	@XmlElement(name = "Conf")
	public List<Max2000Text> getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(List<Max2000Text> confirmation) {
		this.confirmation = confirmation;
	}
}