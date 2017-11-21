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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.CashAccountIdentification1Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
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
 * Provides information about the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmSecuritiesAccountIdentificationOrCashAccountIdentificationRule
 * ProceedsDelivery1.
 * mmSecuritiesAccountIdentificationOrCashAccountIdentificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmSecuritiesAccountIdentification
 * ProceedsDelivery1.mmSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmCashAccountIdentification
 * ProceedsDelivery1.mmCashAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmAccountOwnerIdentification
 * ProceedsDelivery1.mmAccountOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmAccountServicerIdentification
 * ProceedsDelivery1.mmAccountServicerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
 * CorporateActionProceedsDeliveryInstruction}</li>
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
 * "ProceedsDelivery1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProceedsDelivery1", propOrder = {"securitiesAccountIdentification", "cashAccountIdentification", "accountOwnerIdentification", "accountServicerIdentification"})
public class ProceedsDelivery1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text securitiesAccountIdentification;
	/**
	 * identification of the securities account to which the securities have to
	 * be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1
	 * ProceedsDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "identification of the securities account to which the securities have to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> ProceedsDelivery1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentification";
			definition = "identification of the securities account to which the securities have to be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CashAccountIdentification1Choice cashAccountIdentification;
	/**
	 * Identification of the cash account to which the cash has to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice
	 * CashAccountIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1
	 * ProceedsDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cash account to which the cash has to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> ProceedsDelivery1.mmObject();
			isDerived = false;
			xmlTag = "CshAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentification";
			definition = "Identification of the cash account to which the cash has to be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccountIdentification1Choice.mmObject();
		}
	};
	protected PartyIdentification2Choice accountOwnerIdentification;
	/**
	 * Identification of the party that owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1
	 * ProceedsDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party that owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ProceedsDelivery1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIdentification";
			definition = "Identification of the party that owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected PartyIdentification2Choice accountServicerIdentification;
	/**
	 * Identification of the institution servicing the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1
	 * ProceedsDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the institution servicing the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ProceedsDelivery1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Identification of the institution servicing the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	/**
	 * Either SecuritiesAccountIdentification or CashAccountIdentification must
	 * be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1
	 * ProceedsDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmSecuritiesAccountIdentification
	 * ProceedsDelivery1.mmSecuritiesAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProceedsDelivery1#mmCashAccountIdentification
	 * ProceedsDelivery1.mmCashAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentificationOrCashAccountIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either SecuritiesAccountIdentification or CashAccountIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmSecuritiesAccountIdentificationOrCashAccountIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentificationOrCashAccountIdentificationRule";
			definition = "Either SecuritiesAccountIdentification or CashAccountIdentification must be present.";
			messageComponent_lazy = () -> ProceedsDelivery1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(ProceedsDelivery1.mmSecuritiesAccountIdentification, ProceedsDelivery1.mmCashAccountIdentification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProceedsDelivery1.mmSecuritiesAccountIdentification, ProceedsDelivery1.mmCashAccountIdentification, ProceedsDelivery1.mmAccountOwnerIdentification,
						ProceedsDelivery1.mmAccountServicerIdentification);
				trace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ProceedsDelivery1";
				definition = "Provides information about the account.";
				xors_lazy = () -> Arrays.asList(ProceedsDelivery1.mmSecuritiesAccountIdentificationOrCashAccountIdentificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesAcctId", required = true)
	public Max35Text getSecuritiesAccountIdentification() {
		return securitiesAccountIdentification;
	}

	public void setSecuritiesAccountIdentification(Max35Text securitiesAccountIdentification) {
		this.securitiesAccountIdentification = securitiesAccountIdentification;
	}

	@XmlElement(name = "CshAcctId", required = true)
	public CashAccountIdentification1Choice getCashAccountIdentification() {
		return cashAccountIdentification;
	}

	public void setCashAccountIdentification(CashAccountIdentification1Choice cashAccountIdentification) {
		this.cashAccountIdentification = cashAccountIdentification;
	}

	@XmlElement(name = "AcctOwnrId")
	public PartyIdentification2Choice getAccountOwnerIdentification() {
		return accountOwnerIdentification;
	}

	public void setAccountOwnerIdentification(PartyIdentification2Choice accountOwnerIdentification) {
		this.accountOwnerIdentification = accountOwnerIdentification;
	}

	@XmlElement(name = "AcctSvcrId")
	public PartyIdentification2Choice getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public void setAccountServicerIdentification(PartyIdentification2Choice accountServicerIdentification) {
		this.accountServicerIdentification = accountServicerIdentification;
	}
}