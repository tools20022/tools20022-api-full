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
import com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02;
import com.tools20022.repository.area.tsmt.IntentToPayNotificationV02;
import com.tools20022.repository.choice.BreakDown1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of an intention to pay based on purchase orders or
 * commercial invoice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay2#mmBreakdown
 * IntentToPay2.mmBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntentToPay2#mmExpectedPaymentDate
 * IntentToPay2.mmExpectedPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay2#mmSettlementTerms
 * IntentToPay2.mmSettlementTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmIntentToPay
 * IntentToPayNotificationV02.mmIntentToPay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmIntentToPay
 * ForwardIntentToPayNotificationV02.mmIntentToPay}</li>
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
 * "IntentToPay2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of an intention to pay based on purchase orders or commercial invoice."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.IntentToPay1
 * IntentToPay1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntentToPay2", propOrder = {"breakdown", "expectedPaymentDate", "settlementTerms"})
public class IntentToPay2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BreakDown1Choice breakdown;
	/**
	 * Specifies if breakdown is by purchase order or commercial invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BreakDown1Choice
	 * BreakDown1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2 IntentToPay2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Breakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if breakdown is by purchase order or commercial invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBreakdown = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntentToPay2.mmObject();
			isDerived = false;
			xmlTag = "Brkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Breakdown";
			definition = "Specifies if breakdown is by purchase order or commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BreakDown1Choice.mmObject();
		}
	};
	protected ISODate expectedPaymentDate;
	/**
	 * Date at which the payment would be effected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2 IntentToPay2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the payment would be effected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmExpectedPaymentDate
	 * IntentToPay1.mmExpectedPaymentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> IntentToPay2.mmObject();
			isDerived = false;
			xmlTag = "XpctdPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedPaymentDate";
			definition = "Date at which the payment would be effected.";
			previousVersion_lazy = () -> IntentToPay1.mmExpectedPaymentDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SettlementTerms3 settlementTerms;
	/**
	 * Specifies the beneficiary's account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms3
	 * SettlementTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2 IntentToPay2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the beneficiary's account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmSettlementTerms
	 * IntentToPay1.mmSettlementTerms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> IntentToPay2.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Specifies the beneficiary's account information.";
			previousVersion_lazy = () -> IntentToPay1.mmSettlementTerms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTerms3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntentToPay2.mmBreakdown, IntentToPay2.mmExpectedPaymentDate, IntentToPay2.mmSettlementTerms);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntentToPayNotificationV02.mmIntentToPay, ForwardIntentToPayNotificationV02.mmIntentToPay);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntentToPay2";
				definition = "Specifies the details of an intention to pay based on purchase orders or commercial invoice.";
				previousVersion_lazy = () -> IntentToPay1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Brkdwn", required = true)
	public BreakDown1Choice getBreakdown() {
		return breakdown;
	}

	public void setBreakdown(BreakDown1Choice breakdown) {
		this.breakdown = breakdown;
	}

	@XmlElement(name = "XpctdPmtDt", required = true)
	public ISODate getExpectedPaymentDate() {
		return expectedPaymentDate;
	}

	public void setExpectedPaymentDate(ISODate expectedPaymentDate) {
		this.expectedPaymentDate = expectedPaymentDate;
	}

	@XmlElement(name = "SttlmTerms")
	public SettlementTerms3 getSettlementTerms() {
		return settlementTerms;
	}

	public void setSettlementTerms(com.tools20022.repository.msg.SettlementTerms3 settlementTerms) {
		this.settlementTerms = settlementTerms;
	}
}