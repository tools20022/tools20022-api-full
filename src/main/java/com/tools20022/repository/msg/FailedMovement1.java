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
import com.tools20022.repository.choice.FailedSettlementReason1FormatChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
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
 * Provides information about a movement that failed the settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmCashAmountOrSecuritiesQuantityRule
 * FailedMovement1.mmCashAmountOrSecuritiesQuantityRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1#mmCashAmount
 * FailedMovement1.mmCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmSecuritiesQuantity
 * FailedMovement1.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmSecurityIdentification
 * FailedMovement1.mmSecurityIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1#mmReason
 * FailedMovement1.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
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
 * "FailedMovement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about  a movement that failed the settlement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FailedMovement1", propOrder = {"cashAmount", "securitiesQuantity", "securityIdentification", "reason"})
public class FailedMovement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount cashAmount;
	/**
	 * Amount of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1
	 * FailedMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> FailedMovement1.mmObject();
			isDerived = false;
			xmlTag = "CshAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmount";
			definition = "Amount of cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice securitiesQuantity;
	/**
	 * Quantity of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1
	 * FailedMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> FailedMovement1.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected SecurityIdentification7 securityIdentification;
	/**
	 * Identification of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1
	 * FailedMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FailedMovement1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	protected FailedSettlementReason1FormatChoice reason;
	/**
	 * The reason for the settlement failure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FailedSettlementReason1FormatChoice
	 * FailedSettlementReason1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmMovementFailureReason
	 * CorporateActionStatusReason.mmMovementFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1
	 * FailedMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the settlement failure."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmMovementFailureReason;
			componentContext_lazy = () -> FailedMovement1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "The reason for the settlement failure.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FailedSettlementReason1FormatChoice.mmObject();
		}
	};
	/**
	 * Either CashAmount or SecuritiesQuantity must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1
	 * FailedMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmCashAmount
	 * FailedMovement1.mmCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmSecuritiesQuantity
	 * FailedMovement1.mmSecuritiesQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountOrSecuritiesQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either CashAmount or SecuritiesQuantity must be present."</li>
	 * </ul>
	 */
	public static final MMXor mmCashAmountOrSecuritiesQuantityRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountOrSecuritiesQuantityRule";
			definition = "Either CashAmount or SecuritiesQuantity must be present.";
			messageComponent_lazy = () -> FailedMovement1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(FailedMovement1.mmCashAmount, FailedMovement1.mmSecuritiesQuantity);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FailedMovement1.mmCashAmount, FailedMovement1.mmSecuritiesQuantity, FailedMovement1.mmSecurityIdentification, FailedMovement1.mmReason);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FailedMovement1";
				definition = "Provides information about  a movement that failed the settlement.";
				xors_lazy = () -> Arrays.asList(FailedMovement1.mmCashAmountOrSecuritiesQuantityRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CshAmt", required = true)
	public ActiveCurrencyAndAmount getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(ActiveCurrencyAndAmount cashAmount) {
		this.cashAmount = cashAmount;
	}

	@XmlElement(name = "SctiesQty", required = true)
	public UnitOrFaceAmount1Choice getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(UnitOrFaceAmount1Choice securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	@XmlElement(name = "SctyId")
	public SecurityIdentification7 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification7 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	@XmlElement(name = "Rsn", required = true)
	public FailedSettlementReason1FormatChoice getReason() {
		return reason;
	}

	public void setReason(FailedSettlementReason1FormatChoice reason) {
		this.reason = reason;
	}
}