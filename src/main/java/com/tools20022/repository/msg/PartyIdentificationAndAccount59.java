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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CashAccountIdentification6Choice;
import com.tools20022.repository.choice.PartyIdentification59Choice;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmIdentification
 * PartyIdentificationAndAccount59.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmAlternateIdentification
 * PartyIdentificationAndAccount59.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmCashAccount
 * PartyIdentificationAndAccount59.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmChargesAccount
 * PartyIdentificationAndAccount59.mmChargesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmCommissionAccount
 * PartyIdentificationAndAccount59.mmCommissionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmTaxAccount
 * PartyIdentificationAndAccount59.mmTaxAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmAdditionalInformation
 * PartyIdentificationAndAccount59.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationAndAccount59"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party and account details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentificationAndAccount59", propOrder = {"identification", "alternateIdentification", "cashAccount", "chargesAccount", "commissionAccount", "taxAccount", "additionalInformation"})
public class PartyIdentificationAndAccount59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification59Choice identification;
	/**
	 * Identification of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice
	 * PartyIdentification59Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
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
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification59Choice.mmObject();
		}
	};
	protected AlternatePartyIdentification3 alternateIdentification;
	/**
	 * Alternate identification for a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3
	 * AlternatePartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
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
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "AltrnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateIdentification";
			definition = "Alternate identification for a party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlternatePartyIdentification3.mmObject();
		}
	};
	protected CashAccountIdentification6Choice cashAccount;
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}
	};
	protected CashAccountIdentification6Choice chargesAccount;
	/**
	 * Account to be used for charges/fees if different from the account for
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to be used for charges/fees if different from the account for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account to be used for charges/fees if different from the account for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}
	};
	protected CashAccountIdentification6Choice commissionAccount;
	/**
	 * Account to be used for commission if different from the account for
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to be used for commission if different from the account for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "ComssnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionAccount";
			definition = "Account to be used for commission if different from the account for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}
	};
	protected CashAccountIdentification6Choice taxAccount;
	/**
	 * Account to be used for taxes if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to be used for taxes if different from the account for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "TaxAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes if different from the account for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}
	};
	protected PartyTextInformation4 additionalInformation;
	/**
	 * Provides additional information to a party identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyTextInformation4
	 * PartyTextInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
	 * PartyIdentificationAndAccount59}</li>
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
			componentContext_lazy = () -> PartyIdentificationAndAccount59.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information to a party identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyTextInformation4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentificationAndAccount59.mmIdentification, PartyIdentificationAndAccount59.mmAlternateIdentification, PartyIdentificationAndAccount59.mmCashAccount,
						PartyIdentificationAndAccount59.mmChargesAccount, PartyIdentificationAndAccount59.mmCommissionAccount, PartyIdentificationAndAccount59.mmTaxAccount, PartyIdentificationAndAccount59.mmAdditionalInformation);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentificationAndAccount59";
				definition = "Party and account details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public PartyIdentification59Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification59Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AltrnId")
	public AlternatePartyIdentification3 getAlternateIdentification() {
		return alternateIdentification;
	}

	public void setAlternateIdentification(com.tools20022.repository.msg.AlternatePartyIdentification3 alternateIdentification) {
		this.alternateIdentification = alternateIdentification;
	}

	@XmlElement(name = "CshAcct")
	public CashAccountIdentification6Choice getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(CashAccountIdentification6Choice cashAccount) {
		this.cashAccount = cashAccount;
	}

	@XmlElement(name = "ChrgsAcct")
	public CashAccountIdentification6Choice getChargesAccount() {
		return chargesAccount;
	}

	public void setChargesAccount(CashAccountIdentification6Choice chargesAccount) {
		this.chargesAccount = chargesAccount;
	}

	@XmlElement(name = "ComssnAcct")
	public CashAccountIdentification6Choice getCommissionAccount() {
		return commissionAccount;
	}

	public void setCommissionAccount(CashAccountIdentification6Choice commissionAccount) {
		this.commissionAccount = commissionAccount;
	}

	@XmlElement(name = "TaxAcct")
	public CashAccountIdentification6Choice getTaxAccount() {
		return taxAccount;
	}

	public void setTaxAccount(CashAccountIdentification6Choice taxAccount) {
		this.taxAccount = taxAccount;
	}

	@XmlElement(name = "AddtlInf")
	public PartyTextInformation4 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(com.tools20022.repository.msg.PartyTextInformation4 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}