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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PaymentCodeOrOther1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Processes by which an obligation is extinguished fully or partially.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ObligationFulfilment" src="doc-files/ObligationFulfilment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmOffset
 * Obligation.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
 * Obligation.mmOriginalObligationProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery
 * ProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting Netting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rollover Rollover}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Novation Novation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
 * ObligationFulfilment.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
 * ObligationFulfilment.mmObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
 * ObligationFulfilment.mmResultingObligation}</li>
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
 * "ObligationFulfilment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processes by which an obligation is extinguished fully or partially."</li>
 * </ul>
 */
public class ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate date;
	/**
	 * Date and time on which assets become available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer4#mmEffectiveTransferDate
	 * Transfer4.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmEffectiveTransferDate
	 * Transfer7.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#mmEffectiveTransferDate
	 * Transfer17.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer2#mmEffectiveTransferDate
	 * Transfer2.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmEffectiveTransferDate
	 * Transfer10.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#mmEffectiveTransferDate
	 * Transfer14.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmEffectiveTransferDate
	 * Transfer24.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmEffectiveTransferDate
	 * Transfer25.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmEffectiveTransferDate
	 * Transfer18.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmEffectiveTransferDate
	 * Transfer26.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmEffectiveTransferDate
	 * Transfer13.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmEffectiveTransferDate
	 * Transfer23.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1#mmDeliveryDateTime
	 * TradeDelivery1.mmDeliveryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmExpectedPaymentDate
	 * IntentToPay1.mmExpectedPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmPrepaymentDate
	 * ExpectedExecutionDetails3.mmPrepaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmPaymentDueDate
	 * PaymentCodeOrOther1Choice.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmEffectiveTransferDate
	 * Transfer28.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmEffectiveTransferDate
	 * Transfer29.mmEffectiveTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2#mmExpectedPaymentDate
	 * IntentToPay2.mmExpectedPaymentDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount6#mmDateTime
	 * DetailedAmount6.mmDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentDate
	 * ReconciliationList1.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#mmTransactionDate
	 * ATMAccountStatement2.mmTransactionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmInitiatorTransactionDateTime
	 * CardTransaction10.mmInitiatorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmInitiatorTransactionDateTime
	 * CardTransaction9.mmInitiatorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmValidityDate
	 * CardTransactionDetail2.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmValidityDate
	 * CardTransactionDetail1.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmValidityDate
	 * CardTransactionDetail4.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmValidityDate
	 * CardTransactionDetail3.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmTransactionDate
	 * TransactionCertificate2.mmTransactionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateReference1#mmDate
	 * CertificateReference1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmEffectiveTransferDate
	 * Transfer31.mmEffectiveTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmAverageDate
	 * Transfer31.mmAverageDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmNewAverageDate
	 * Transfer31.mmNewAverageDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmEffectiveTransferDate
	 * Transfer33.mmEffectiveTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#mmAverageDate
	 * Transfer33.mmAverageDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmNewAverageDate
	 * Transfer33.mmNewAverageDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount14#mmDateTime
	 * DetailedAmount14.mmDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryDateTime
	 * TradeDelivery2.mmDeliveryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#mmDate
	 * MandateAuthentication1.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which assets become available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer4.mmEffectiveTransferDate, Transfer7.mmEffectiveTransferDate, Transfer17.mmEffectiveTransferDate, Transfer2.mmEffectiveTransferDate, Transfer10.mmEffectiveTransferDate,
					Transfer14.mmEffectiveTransferDate, Transfer24.mmEffectiveTransferDate, Transfer25.mmEffectiveTransferDate, Transfer18.mmEffectiveTransferDate, Transfer26.mmEffectiveTransferDate, Transfer13.mmEffectiveTransferDate,
					Transfer23.mmEffectiveTransferDate, TradeDelivery1.mmDeliveryDateTime, IntentToPay1.mmExpectedPaymentDate, ExpectedExecutionDetails3.mmPrepaymentDate, PaymentCodeOrOther1Choice.mmPaymentDueDate,
					Transfer28.mmEffectiveTransferDate, Transfer29.mmEffectiveTransferDate, IntentToPay2.mmExpectedPaymentDate, DetailedAmount6.mmDateTime, ReconciliationList1.mmPaymentDate, ATMAccountStatement2.mmTransactionDate,
					CardTransaction10.mmInitiatorTransactionDateTime, CardTransaction9.mmInitiatorTransactionDateTime, CardTransactionDetail2.mmValidityDate, CardTransactionDetail1.mmValidityDate, CardTransactionDetail4.mmValidityDate,
					CardTransactionDetail3.mmValidityDate, TransactionCertificate2.mmTransactionDate, CertificateReference1.mmDate, Transfer31.mmEffectiveTransferDate, Transfer31.mmAverageDate, Transfer31.mmNewAverageDate,
					Transfer33.mmEffectiveTransferDate, Transfer33.mmAverageDate, Transfer33.mmNewAverageDate, DetailedAmount14.mmDateTime, TradeDelivery2.mmDeliveryDateTime, MandateAuthentication1.mmDate);
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date and time on which assets become available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> obligationOffset;
	/**
	 * Specifies the obligation which has been offset for instance a payment
	 * obligation or a securities delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmOffset
	 * Obligation.mmOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligationOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligation which has been offset for instance a payment obligation or a securities delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmObligationOffset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ObligationOffset";
			definition = "Specifies the obligation which has been offset for instance a payment obligation or a securities delivery.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Obligation> resultingObligation;
	/**
	 * Specifies the obligation which result from a settlement process, for
	 * instance the remaining obligation when the obligations are netted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
	 * Obligation.mmOriginalObligationProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResultingObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingObligation";
			definition = "Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.mmOriginalObligationProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Obligation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ObligationFulfilment";
				definition = "Processes by which an obligation is extinguished fully or partially.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.mmOffset, com.tools20022.repository.entity.Obligation.mmOriginalObligationProcess);
				subType_lazy = () -> Arrays.asList(Payment.mmObject(), SecuritiesTransfer.mmObject(), Clearing.mmObject(), ProductDelivery.mmObject(), BuyIn.mmObject(), PairOff.mmObject(), Netting.mmObject(), Rollover.mmObject(),
						Novation.mmObject());
				element_lazy = () -> Arrays.asList(ObligationFulfilment.mmDate, ObligationFulfilment.mmObligationOffset, ObligationFulfilment.mmResultingObligation);
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public List<Obligation> getObligationOffset() {
		return obligationOffset;
	}

	public void setObligationOffset(List<com.tools20022.repository.entity.Obligation> obligationOffset) {
		this.obligationOffset = obligationOffset;
	}

	public List<Obligation> getResultingObligation() {
		return resultingObligation;
	}

	public void setResultingObligation(List<com.tools20022.repository.entity.Obligation> resultingObligation) {
		this.resultingObligation = resultingObligation;
	}
}