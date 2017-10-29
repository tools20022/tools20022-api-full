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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.RejectReasonCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a payment by card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentStatus" src="doc-files/CardPaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#RejectionReason
 * CardPaymentStatus.RejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#FailureReason
 * CardPaymentStatus.FailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#CardPayment
 * CardPaymentStatus.CardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentStatus
 * CardPayment.CardPaymentStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection1
 * AcceptorRejection1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1
 * AcceptorReconciliationResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2
 * AcceptorReconciliationResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection2
 * AcceptorRejection2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection3
 * AcceptorRejection3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3
 * AcceptorReconciliationResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection4
 * AcceptorRejection4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4
 * AcceptorReconciliationResponse4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a payment by card."</li>
 * </ul>
 */
public class CardPaymentStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason of the rejection of a request or an advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1#RejectReason
	 * AcceptorRejection1.RejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#RejectReason
	 * AcceptorRejection2.RejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection3#RejectReason
	 * AcceptorRejection3.RejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#RejectReason
	 * AcceptorRejection4.RejectReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the rejection of a request or an advice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorRejection1.RejectReason, com.tools20022.repository.msg.AcceptorRejection2.RejectReason, com.tools20022.repository.msg.AcceptorRejection3.RejectReason,
					com.tools20022.repository.msg.AcceptorRejection4.RejectReason);
			elementContext_lazy = () -> CardPaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason of the rejection of a request or an advice.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectReasonCode.mmObject();
		}
	};
	/**
	 * List of incidents during the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#FailureReason
	 * CardPaymentTransaction4.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#FailureReason
	 * CardPaymentTransaction14.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#FailureReason
	 * CardPaymentTransaction7.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#FailureReason
	 * CardPaymentTransaction16.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#FailureReason
	 * CardPaymentTransaction20.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#FailureReason
	 * CardPaymentTransaction3.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#FailureReason
	 * CardPaymentTransaction13.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#FailureReason
	 * CardPaymentTransaction28.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#FailureReason
	 * CardPaymentTransaction29.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#FailureReason
	 * CardPaymentTransaction25.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#FailureReason
	 * CardPaymentTransaction30.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#FailureReason
	 * CardPaymentTransaction44.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#FailureReason
	 * CardPaymentTransaction45.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#FailureReason
	 * CardPaymentTransaction46.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#FailureReason
	 * CardPaymentTransaction40.FailureReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction5#Incident
	 * ATMTransaction5.Incident}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#FailureReason
	 * CardPaymentTransaction60.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#FailureReason
	 * CardPaymentTransaction61.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#FailureReason
	 * CardPaymentTransaction59.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#FailureReason
	 * CardPaymentTransaction55.FailureReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction20#Incident
	 * ATMTransaction20.Incident}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#FailureReason
	 * CardPaymentTransaction75.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#FailureReason
	 * CardPaymentTransaction70.FailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#FailureReason
	 * CardPaymentTransaction69.FailureReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of incidents during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FailureReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction4.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction14.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction7.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction16.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction20.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction3.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction13.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction28.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction29.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction25.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction30.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction44.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction45.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction46.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction40.FailureReason, com.tools20022.repository.msg.ATMTransaction5.Incident, com.tools20022.repository.msg.CardPaymentTransaction60.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction61.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction59.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction55.FailureReason,
					com.tools20022.repository.msg.ATMTransaction20.Incident, com.tools20022.repository.msg.CardPaymentTransaction75.FailureReason, com.tools20022.repository.msg.CardPaymentTransaction70.FailureReason,
					com.tools20022.repository.msg.CardPaymentTransaction69.FailureReason);
			elementContext_lazy = () -> CardPaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "List of incidents during the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}
	};
	/**
	 * Card payment for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentStatus
	 * CardPayment.CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1#Environment
	 * AcceptorReconciliationResponse1.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#Environment
	 * AcceptorReconciliationResponse2.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#Environment
	 * AcceptorReconciliationResponse3.Environment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#Environment
	 * AcceptorReconciliationResponse4.Environment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationResponse1.Environment, com.tools20022.repository.msg.AcceptorReconciliationResponse2.Environment,
					com.tools20022.repository.msg.AcceptorReconciliationResponse3.Environment, com.tools20022.repository.msg.AcceptorReconciliationResponse4.Environment);
			elementContext_lazy = () -> CardPaymentStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a status is provided.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.CardPaymentStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentStatus";
				definition = "Status of a payment by card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.CardPaymentStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentStatus.RejectionReason, com.tools20022.repository.entity.CardPaymentStatus.FailureReason,
						com.tools20022.repository.entity.CardPaymentStatus.CardPayment);
				derivationComponent_lazy = () -> Arrays.asList(AcceptorRejection1.mmObject(), AcceptorReconciliationResponse1.mmObject(), AcceptorReconciliationResponse2.mmObject(), AcceptorRejection2.mmObject(),
						AcceptorRejection3.mmObject(), AcceptorReconciliationResponse3.mmObject(), AcceptorRejection4.mmObject(), AcceptorReconciliationResponse4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}