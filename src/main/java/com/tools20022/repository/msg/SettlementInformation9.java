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
import com.tools20022.repository.choice.ClearingSystemIdentification1Choice;
import com.tools20022.repository.codeset.SettlementMethod2Code;
import com.tools20022.repository.entity.CashClearingSystem;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information required for the settlement the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmSettlementMethod
 * SettlementInformation9.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmSettlementAccount
 * SettlementInformation9.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmClearingSystem
 * SettlementInformation9.mmClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
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
 * "SettlementInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information required for the settlement the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementInformation9", propOrder = {"settlementMethod", "settlementAccount", "clearingSystem"})
public class SettlementInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementMethod2Code settlementMethod;
	/**
	 * Method used to settle the (batch of) payment instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod2Code
	 * SettlementMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementMethod
	 * CashSettlement.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9
	 * SettlementInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementMethod;
			componentContext_lazy = () -> SettlementInformation9.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethod2Code.mmObject();
		}
	};
	protected CashAccount7 settlementAccount;
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9
	 * SettlementInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> SettlementInformation9.mmObject();
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected ClearingSystemIdentification1Choice clearingSystem;
	/**
	 * Specification of a pre-agreed offering between clearing agents or the
	 * channel through which the payment instruction is processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice
	 * ClearingSystemIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9
	 * SettlementInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingSystem = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashClearingSystem.mmObject();
			componentContext_lazy = () -> SettlementInformation9.mmObject();
			isDerived = false;
			xmlTag = "ClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemIdentification1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementInformation9.mmSettlementMethod, SettlementInformation9.mmSettlementAccount, SettlementInformation9.mmClearingSystem);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInformation9";
				definition = "Further information required for the settlement the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmMtd", required = true)
	public SettlementMethod2Code getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(SettlementMethod2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	@XmlElement(name = "SttlmAcct")
	public CashAccount7 getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(com.tools20022.repository.msg.CashAccount7 settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	@XmlElement(name = "ClrSys")
	public ClearingSystemIdentification1Choice getClearingSystem() {
		return clearingSystem;
	}

	public void setClearingSystem(ClearingSystemIdentification1Choice clearingSystem) {
		this.clearingSystem = clearingSystem;
	}
}