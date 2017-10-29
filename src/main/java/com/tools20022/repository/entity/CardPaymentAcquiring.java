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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment processes initiated by a payment card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentAcquiring" src="doc-files/CardPaymentAcquiring.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#PointOfInteraction
 * CardPaymentAcquiring.PointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPaymentService
 * CardPaymentAcquiring.CardPaymentService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionIdentification
 * CardPaymentAcquiring.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionDateTime
 * CardPaymentAcquiring.TransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ICCRelatedData
 * CardPaymentAcquiring.ICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RelatedCardPayment
 * CardPaymentAcquiring.RelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardPresent
 * CardPaymentAcquiring.CardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardholderPresent
 * CardPaymentAcquiring.CardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#OnLineContext
 * CardPaymentAcquiring.OnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#AttendanceContext
 * CardPaymentAcquiring.AttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionEnvironment
 * CardPaymentAcquiring.TransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TransactionChannel
 * CardPaymentAcquiring.TransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#AttendantMessageCapable
 * CardPaymentAcquiring.AttendantMessageCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#AttendantLanguage
 * CardPaymentAcquiring.AttendantLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CardDataEntryMode
 * CardPaymentAcquiring.CardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#FallbackIndicator
 * CardPaymentAcquiring.FallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#TMSTrigger
 * CardPaymentAcquiring.TMSTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#InitiatorTransactionIdentifier
 * CardPaymentAcquiring.InitiatorTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Reversal
 * CardPaymentAcquiring.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#InterchangeData
 * CardPaymentAcquiring.InterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#UnattendedLevelCategory
 * CardPaymentAcquiring.UnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
 * CardPaymentAcquiring.Validation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CompletionRequired
 * CardPaymentAcquiring.CompletionRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ActionType
 * CardPaymentAcquiring.ActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#ActionMessage
 * CardPaymentAcquiring.ActionMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#CaptureIndicator
 * CardPaymentAcquiring.CaptureIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#RecipientTransactionIdentification
 * CardPaymentAcquiring.RecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Location
 * CardPaymentAcquiring.Location}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Country
 * CardPaymentAcquiring.Country}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#RelatedCardPayment
 * Country.RelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
 * CardPayment.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardPaymentAcquiring
 * PointOfInteraction.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#CardPaymentAcquiring
 * TerminalManagementSystem.CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardPayment
 * CardPaymentValidation.CardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext3#PaymentContext
 * CardPaymentContext3.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext3#SaleContext
 * CardPaymentContext3.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext4#PaymentContext
 * CardPaymentContext4.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext4#SaleContext
 * CardPaymentContext4.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1#PaymentContext
 * CardPaymentContext1.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1#SaleContext
 * CardPaymentContext1.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext2#PaymentContext
 * CardPaymentContext2.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext2#SaleContext
 * CardPaymentContext2.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext7#PaymentContext
 * CardPaymentContext7.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext7#SaleContext
 * CardPaymentContext7.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext6#PaymentContext
 * CardPaymentContext6.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext6#SaleContext
 * CardPaymentContext6.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext5#PaymentContext
 * CardPaymentContext5.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext5#SaleContext
 * CardPaymentContext5.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext8#PaymentContext
 * CardPaymentContext8.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext8#SaleContext
 * CardPaymentContext8.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext11#PaymentContext
 * CardPaymentContext11.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext11#SaleContext
 * CardPaymentContext11.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext13#PaymentContext
 * CardPaymentContext13.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext13#SaleContext
 * CardPaymentContext13.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext9#PaymentContext
 * CardPaymentContext9.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext9#SaleContext
 * CardPaymentContext9.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext12#PaymentContext
 * CardPaymentContext12.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext12#SaleContext
 * CardPaymentContext12.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10#PaymentContext
 * CardPaymentContext10.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10#SaleContext
 * CardPaymentContext10.SaleContext}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult8#Action
 * AuthorisationResult8.Action}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext3#TransactionContext
 * CardTransactionContext3.TransactionContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1#TransactionContext
 * CardTransactionContext1.TransactionContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1#SaleContext
 * CardTransactionContext1.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction6#Reconciliation
 * CardTransaction6.Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext18#PaymentContext
 * CardPaymentContext18.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext18#SaleContext
 * CardPaymentContext18.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext14#PaymentContext
 * CardPaymentContext14.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext14#SaleContext
 * CardPaymentContext14.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext17#PaymentContext
 * CardPaymentContext17.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext17#SaleContext
 * CardPaymentContext17.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext19#PaymentContext
 * CardPaymentContext19.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext19#SaleContext
 * CardPaymentContext19.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext16#PaymentContext
 * CardPaymentContext16.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext16#SaleContext
 * CardPaymentContext16.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext15#PaymentContext
 * CardPaymentContext15.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext15#SaleContext
 * CardPaymentContext15.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext25#PaymentContext
 * CardPaymentContext25.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext25#SaleContext
 * CardPaymentContext25.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24#PaymentContext
 * CardPaymentContext24.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24#SaleContext
 * CardPaymentContext24.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext20#PaymentContext
 * CardPaymentContext20.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext20#SaleContext
 * CardPaymentContext20.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext21#PaymentContext
 * CardPaymentContext21.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext21#SaleContext
 * CardPaymentContext21.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext22#PaymentContext
 * CardPaymentContext22.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext22#SaleContext
 * CardPaymentContext22.SaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext23#PaymentContext
 * CardPaymentContext23.PaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext23#SaleContext
 * CardPaymentContext23.SaleContext}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifier1
 * TransactionIdentifier1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext3
 * PaymentContext3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext1
 * PaymentContext1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext3
 * CardPaymentContext3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext4
 * PaymentContext4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext4
 * CardPaymentContext4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage1 ActionMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action1 Action1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action2 Action2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext1
 * CardPaymentContext1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext2
 * PaymentContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext2
 * CardPaymentContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext7
 * PaymentContext7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext7
 * CardPaymentContext7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext6
 * PaymentContext6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext6
 * CardPaymentContext6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext5
 * CardPaymentContext5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext5
 * PaymentContext5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action3 Action3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext10
 * PaymentContext10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext8
 * CardPaymentContext8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext8
 * PaymentContext8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext11
 * CardPaymentContext11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext11
 * PaymentContext11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext13
 * CardPaymentContext13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext13
 * PaymentContext13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext9
 * CardPaymentContext9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext9
 * PaymentContext9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext12
 * CardPaymentContext12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext10
 * CardPaymentContext10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext12
 * PaymentContext12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action4 Action4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action5 Action5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4 ActionMessage4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3 ActionMessage3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext3
 * CardTransactionContext3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifier2
 * TransactionIdentifier2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext1
 * CardTransactionContext1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction3
 * CardTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext4
 * CardTransactionContext4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext2
 * CardTransactionContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext18
 * CardPaymentContext18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext17
 * PaymentContext17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext14
 * CardPaymentContext14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext14
 * PaymentContext14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext17
 * CardPaymentContext17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext19
 * CardPaymentContext19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext18
 * PaymentContext18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage5 ActionMessage5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext16
 * CardPaymentContext16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action6 Action6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext19
 * PaymentContext19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext16
 * PaymentContext16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext15
 * PaymentContext15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext15
 * CardPaymentContext15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action7 Action7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext22
 * PaymentContext22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext25
 * CardPaymentContext25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext24
 * CardPaymentContext24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext24
 * PaymentContext24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext20
 * CardPaymentContext20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext20
 * PaymentContext20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Action8 Action8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext25
 * PaymentContext25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext21
 * CardPaymentContext21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext21
 * PaymentContext21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext22
 * CardPaymentContext22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext23
 * CardPaymentContext23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext23
 * PaymentContext23}</li>
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
 * "CardPaymentAcquiring"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment processes initiated by a payment card."</li>
 * </ul>
 */
public class CardPaymentAcquiring {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Describes the Point of Interaction through which the payment by card was
	 * initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#CardPaymentAcquiring
	 * PointOfInteraction.CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#POI
	 * CardEntry1.POI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1#POI
	 * CardTransaction1.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionData1#PointOfInteraction
	 * TransactionData1.PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment8#POIIdentification
	 * CardPaymentEnvironment8.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment17#POIIdentification
	 * CardPaymentEnvironment17.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment5#POI
	 * CardPaymentEnvironment5.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#POI
	 * CardPaymentEnvironment6.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#POIIdentification
	 * CardPaymentTransaction8.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13#POI
	 * CardPaymentEnvironment13.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#POI
	 * CardPaymentEnvironment14.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#POIIdentification
	 * CardPaymentEnvironment3.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#POIIdentification
	 * CardPaymentEnvironment11.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#POIIdentification
	 * CardPaymentEnvironment16.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1#MessageDestination
	 * ActionMessage1.MessageDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#POI
	 * CardPaymentEnvironment1.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#POI
	 * CardPaymentEnvironment9.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7#POIIdentification
	 * CardPaymentEnvironment7.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15#POIIdentification
	 * CardPaymentEnvironment15.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#POIIdentification
	 * CardPaymentEnvironment19.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4#POI
	 * CardPaymentEnvironment4.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#POI
	 * CardPaymentEnvironment12.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#POI
	 * CardPaymentEnvironment2.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#POI
	 * CardPaymentEnvironment10.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#POI
	 * CardPaymentEnvironment18.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#POIIdentification
	 * CardPaymentEnvironment31.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29#POIIdentification
	 * CardPaymentEnvironment29.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#POI
	 * CardPaymentEnvironment24.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25#POIIdentification
	 * CardPaymentEnvironment25.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#POI
	 * CardPaymentEnvironment20.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#POI
	 * CardPaymentEnvironment30.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#POI
	 * CardPaymentEnvironment27.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#POIIdentification
	 * CardPaymentEnvironment28.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#POIIdentification
	 * CardPaymentEnvironment21.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26#POI
	 * CardPaymentEnvironment26.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#POI
	 * CardPaymentEnvironment23.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#POI
	 * CardPaymentEnvironment22.POI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#POI
	 * CardTransaction2.POI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#POI
	 * CardEntry2.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#POIIdentification
	 * CardPaymentEnvironment37.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33#POIIdentification
	 * CardPaymentEnvironment33.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#POI
	 * CardPaymentEnvironment32.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#POI
	 * CardPaymentEnvironment36.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#POIIdentification
	 * CardPaymentEnvironment43.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41#POIIdentification
	 * CardPaymentEnvironment41.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42#POIIdentification
	 * CardPaymentEnvironment42.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#POI
	 * CardPaymentEnvironment40.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#MessageDestination
	 * ActionMessage2.MessageDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#POI
	 * CardPaymentEnvironment44.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#POI
	 * CardPaymentEnvironment34.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#POI
	 * CardPaymentEnvironment35.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#POIIdentification
	 * CardPaymentEnvironment38.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39#POI
	 * CardPaymentEnvironment39.POI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3#Destination
	 * ActionMessage3.Destination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46#POIIdentification
	 * CardPaymentEnvironment46.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#POIIdentification
	 * CardPaymentEnvironment50.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#POI
	 * CardPaymentEnvironment52.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#POI
	 * CardPaymentEnvironment49.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51#POI
	 * CardPaymentEnvironment51.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#POI
	 * CardPaymentEnvironment48.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#POI
	 * CardPaymentEnvironment56.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#POI
	 * CardPaymentEnvironment45.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#POIIdentification
	 * CardPaymentEnvironment55.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#POIIdentification
	 * CardPaymentEnvironment54.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#POI
	 * CardPaymentEnvironment53.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#POI
	 * CardPaymentEnvironment47.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#POI
	 * CardPaymentEnvironment61.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#POIIdentification
	 * CardPaymentEnvironment64.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#POI
	 * CardPaymentEnvironment60.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#POIIdentification
	 * CardPaymentEnvironment65.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#POIIdentification
	 * CardPaymentEnvironment67.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#POIIdentification
	 * CardPaymentEnvironment66.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#POI
	 * CardPaymentEnvironment62.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#POI
	 * CardPaymentEnvironment63.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#POI
	 * CardPaymentEnvironment58.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#POI
	 * CardPaymentEnvironment59.POI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#POI
	 * CardPaymentEnvironment57.POI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointOfInteraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the Point of Interaction through which the payment by card was initiated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PointOfInteraction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry1.POI, com.tools20022.repository.msg.CardTransaction1.POI, com.tools20022.repository.msg.TransactionData1.PointOfInteraction,
					com.tools20022.repository.msg.CardPaymentEnvironment8.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment17.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment5.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment6.POI, com.tools20022.repository.msg.CardPaymentTransaction8.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment13.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment14.POI, com.tools20022.repository.msg.CardPaymentEnvironment3.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment11.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment16.POIIdentification, com.tools20022.repository.msg.ActionMessage1.MessageDestination, com.tools20022.repository.msg.CardPaymentEnvironment1.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment9.POI, com.tools20022.repository.msg.CardPaymentEnvironment7.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment15.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment19.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment4.POI, com.tools20022.repository.msg.CardPaymentEnvironment12.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment2.POI, com.tools20022.repository.msg.CardPaymentEnvironment10.POI, com.tools20022.repository.msg.CardPaymentEnvironment18.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment31.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment29.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment24.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment25.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment20.POI, com.tools20022.repository.msg.CardPaymentEnvironment30.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment27.POI, com.tools20022.repository.msg.CardPaymentEnvironment28.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment21.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment26.POI, com.tools20022.repository.msg.CardPaymentEnvironment23.POI, com.tools20022.repository.msg.CardPaymentEnvironment22.POI,
					com.tools20022.repository.msg.CardTransaction2.POI, com.tools20022.repository.msg.CardEntry2.POI, com.tools20022.repository.msg.CardPaymentEnvironment37.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment33.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment32.POI, com.tools20022.repository.msg.CardPaymentEnvironment36.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment43.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment41.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment42.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment40.POI, com.tools20022.repository.msg.ActionMessage2.MessageDestination,
					com.tools20022.repository.msg.CardPaymentEnvironment44.POI, com.tools20022.repository.msg.CardPaymentEnvironment34.POI, com.tools20022.repository.msg.CardPaymentEnvironment35.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment38.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment39.POI, com.tools20022.repository.msg.ActionMessage3.Destination,
					com.tools20022.repository.msg.CardPaymentEnvironment46.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment50.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment52.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment49.POI, com.tools20022.repository.msg.CardPaymentEnvironment51.POI, com.tools20022.repository.msg.CardPaymentEnvironment48.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment56.POI, com.tools20022.repository.msg.CardPaymentEnvironment45.POI, com.tools20022.repository.msg.CardPaymentEnvironment55.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment54.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment53.POI, com.tools20022.repository.msg.CardPaymentEnvironment47.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment61.POI, com.tools20022.repository.msg.CardPaymentEnvironment64.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment60.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment65.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment67.POIIdentification,
					com.tools20022.repository.msg.CardPaymentEnvironment66.POIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment62.POI, com.tools20022.repository.msg.CardPaymentEnvironment63.POI,
					com.tools20022.repository.msg.CardPaymentEnvironment58.POI, com.tools20022.repository.msg.CardPaymentEnvironment59.POI, com.tools20022.repository.msg.CardPaymentEnvironment57.POI);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointOfInteraction";
			definition = "Describes the Point of Interaction through which the payment by card was initiated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of service provided by the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
	 * CardPaymentServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1#AdditionalService
	 * CardAggregated1.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#AdditionalService
	 * CardIndividualTransaction1.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#TransactionType
	 * CommonData1.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#AdditionalService
	 * CommonData1.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#ServiceAttribute
	 * CommonData1.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#TransactionType
	 * CardPaymentTransaction8.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#AdditionalService
	 * CardPaymentTransaction8.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#ServiceAttribute
	 * CardPaymentTransaction8.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#TransactionType
	 * CardPaymentTransaction4.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#AdditionalService
	 * CardPaymentTransaction4.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#ServiceAttribute
	 * CardPaymentTransaction4.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#TransactionType
	 * CommonData2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#AdditionalService
	 * CommonData2.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#ServiceAttribute
	 * CommonData2.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#TransactionType
	 * CardPaymentTransaction17.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#AdditionalService
	 * CardPaymentTransaction17.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#ServiceAttribute
	 * CardPaymentTransaction17.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#TransactionType
	 * CardPaymentTransaction14.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#AdditionalService
	 * CardPaymentTransaction14.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#ServiceAttribute
	 * CardPaymentTransaction14.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#TransactionType
	 * CardPaymentTransaction1.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#AdditionalService
	 * CardPaymentTransaction1.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#ServiceAttribute
	 * CardPaymentTransaction1.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#TransactionType
	 * CardPaymentTransaction11.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#AdditionalService
	 * CardPaymentTransaction11.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#ServiceAttribute
	 * CardPaymentTransaction11.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#TransactionType
	 * CardPaymentTransaction19.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#AdditionalService
	 * CardPaymentTransaction19.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#ServiceAttribute
	 * CardPaymentTransaction19.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#TransactionType
	 * CardPaymentTransaction3.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#AdditionalService
	 * CardPaymentTransaction3.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#ServiceAttribute
	 * CardPaymentTransaction3.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#TransactionType
	 * CardPaymentTransaction13.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#AdditionalService
	 * CardPaymentTransaction13.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#ServiceAttribute
	 * CardPaymentTransaction13.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#TransactionType
	 * CardPaymentTransaction21.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#AdditionalService
	 * CardPaymentTransaction21.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#ServiceAttribute
	 * CardPaymentTransaction21.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#TransactionType
	 * CardPaymentTransaction22.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#AdditionalService
	 * CardPaymentTransaction22.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#ServiceAttribute
	 * CardPaymentTransaction22.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#TransactionType
	 * CardPaymentTransaction34.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#AdditionalService
	 * CardPaymentTransaction34.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#ServiceAttribute
	 * CardPaymentTransaction34.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#TransactionType
	 * CardPaymentTransaction31.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#AdditionalService
	 * CardPaymentTransaction31.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#ServiceAttribute
	 * CardPaymentTransaction31.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#TransactionType
	 * CommonData3.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#AdditionalService
	 * CommonData3.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#ServiceAttribute
	 * CommonData3.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#TransactionType
	 * CardPaymentTransaction29.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#AdditionalService
	 * CardPaymentTransaction29.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#ServiceAttribute
	 * CardPaymentTransaction29.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#TransactionType
	 * CardPaymentTransaction25.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#AdditionalService
	 * CardPaymentTransaction25.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#ServiceAttribute
	 * CardPaymentTransaction25.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#AdditionalService
	 * CardIndividualTransaction2.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#TransactionType
	 * CardPaymentTransaction36.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#AdditionalService
	 * CardPaymentTransaction36.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#ServiceAttribute
	 * CardPaymentTransaction36.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#TransactionType
	 * CardPaymentTransaction45.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#AdditionalService
	 * CardPaymentTransaction45.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#ServiceAttribute
	 * CardPaymentTransaction45.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#TransactionType
	 * CardPaymentTransaction37.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#AdditionalService
	 * CardPaymentTransaction37.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#ServiceAttribute
	 * CardPaymentTransaction37.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#TransactionType
	 * CardPaymentTransaction49.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#AdditionalService
	 * CardPaymentTransaction49.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#ServiceAttribute
	 * CardPaymentTransaction49.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#TransactionType
	 * CardPaymentTransaction47.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#AdditionalService
	 * CardPaymentTransaction47.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#ServiceAttribute
	 * CardPaymentTransaction47.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#TransactionType
	 * CommonData4.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#AdditionalService
	 * CommonData4.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#ServiceAttribute
	 * CommonData4.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionType
	 * CardPaymentTransaction40.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#AdditionalService
	 * CardPaymentTransaction40.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#ServiceAttribute
	 * CardPaymentTransaction40.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#TransactionType
	 * CardTransaction4.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#TransactionType
	 * CardTransaction8.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#TransactionType
	 * CardTransaction5.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#AdditionalService
	 * CardTransaction5.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#ServiceAttribute
	 * CardTransaction5.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#TransactionType
	 * CardTransaction15.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#AdditionalService
	 * CardTransaction15.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#ServiceAttribute
	 * CardTransaction15.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#TransactionType
	 * CardTransaction7.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#TransactionType
	 * CardTransaction6.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#TransactionType
	 * CardPaymentTransaction52.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#AdditionalService
	 * CardPaymentTransaction52.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#ServiceAttribute
	 * CardPaymentTransaction52.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#TransactionType
	 * CardPaymentTransaction60.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#AdditionalService
	 * CardPaymentTransaction60.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#ServiceAttribute
	 * CardPaymentTransaction60.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#TransactionType
	 * CardPaymentTransaction64.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#AdditionalService
	 * CardPaymentTransaction64.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#ServiceAttribute
	 * CardPaymentTransaction64.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#TransactionType
	 * CardPaymentTransaction51.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#AdditionalService
	 * CardPaymentTransaction51.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#ServiceAttribute
	 * CardPaymentTransaction51.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#TransactionType
	 * CommonData5.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#AdditionalService
	 * CommonData5.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#ServiceAttribute
	 * CommonData5.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionType
	 * CardPaymentTransaction55.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#AdditionalService
	 * CardPaymentTransaction55.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#ServiceAttribute
	 * CardPaymentTransaction55.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#TransactionType
	 * CardPaymentTransaction62.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#AdditionalService
	 * CardPaymentTransaction62.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#ServiceAttribute
	 * CardPaymentTransaction62.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#TransactionType
	 * CardPaymentTransaction71.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#AdditionalService
	 * CardPaymentTransaction71.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#ServiceAttribute
	 * CardPaymentTransaction71.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#TransactionType
	 * CardPaymentTransaction70.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#AdditionalService
	 * CardPaymentTransaction70.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#ServiceAttribute
	 * CardPaymentTransaction70.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#TransactionType
	 * CardPaymentTransaction72.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#AdditionalService
	 * CardPaymentTransaction72.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#ServiceAttribute
	 * CardPaymentTransaction72.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#TransactionType
	 * CardPaymentTransaction76.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#AdditionalService
	 * CardPaymentTransaction76.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#ServiceAttribute
	 * CardPaymentTransaction76.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#TransactionType
	 * CommonData6.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#AdditionalService
	 * CommonData6.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#ServiceAttribute
	 * CommonData6.ServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionType
	 * CardPaymentTransaction69.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#AdditionalService
	 * CardPaymentTransaction69.AdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#ServiceAttribute
	 * CardPaymentTransaction69.ServiceAttribute}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of service provided by the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardPaymentService = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAggregated1.AdditionalService, com.tools20022.repository.msg.CardIndividualTransaction1.AdditionalService,
					com.tools20022.repository.msg.CommonData1.TransactionType, com.tools20022.repository.msg.CommonData1.AdditionalService, com.tools20022.repository.msg.CommonData1.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction8.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction8.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction8.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction4.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction4.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction4.ServiceAttribute,
					com.tools20022.repository.msg.CommonData2.TransactionType, com.tools20022.repository.msg.CommonData2.AdditionalService, com.tools20022.repository.msg.CommonData2.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction17.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction17.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction17.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction14.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction14.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction14.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction1.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction1.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction1.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction11.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction11.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction11.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction19.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction19.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction19.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction3.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction3.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction3.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction13.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction13.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction13.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction21.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction21.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction21.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction22.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction22.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction22.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction34.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction34.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction34.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction31.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction31.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction31.ServiceAttribute,
					com.tools20022.repository.msg.CommonData3.TransactionType, com.tools20022.repository.msg.CommonData3.AdditionalService, com.tools20022.repository.msg.CommonData3.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction29.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction29.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction29.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction25.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction25.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction25.ServiceAttribute,
					com.tools20022.repository.msg.CardIndividualTransaction2.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction36.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction36.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction36.ServiceAttribute, com.tools20022.repository.msg.CardPaymentTransaction45.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction45.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction45.ServiceAttribute, com.tools20022.repository.msg.CardPaymentTransaction37.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction37.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction37.ServiceAttribute, com.tools20022.repository.msg.CardPaymentTransaction49.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction49.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction49.ServiceAttribute, com.tools20022.repository.msg.CardPaymentTransaction47.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction47.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction47.ServiceAttribute, com.tools20022.repository.msg.CommonData4.TransactionType,
					com.tools20022.repository.msg.CommonData4.AdditionalService, com.tools20022.repository.msg.CommonData4.ServiceAttribute, com.tools20022.repository.msg.CardPaymentTransaction40.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction40.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction40.ServiceAttribute, com.tools20022.repository.msg.CardTransaction4.TransactionType,
					com.tools20022.repository.msg.CardTransaction8.TransactionType, com.tools20022.repository.msg.CardTransaction5.TransactionType, com.tools20022.repository.msg.CardTransaction5.AdditionalService,
					com.tools20022.repository.msg.CardTransaction5.ServiceAttribute, com.tools20022.repository.msg.CardTransaction15.TransactionType, com.tools20022.repository.msg.CardTransaction15.AdditionalService,
					com.tools20022.repository.msg.CardTransaction15.ServiceAttribute, com.tools20022.repository.msg.CardTransaction7.TransactionType, com.tools20022.repository.msg.CardTransaction6.TransactionType,
					com.tools20022.repository.msg.CardPaymentTransaction52.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction52.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction52.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction60.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction60.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction60.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction64.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction64.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction64.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction51.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction51.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction51.ServiceAttribute,
					com.tools20022.repository.msg.CommonData5.TransactionType, com.tools20022.repository.msg.CommonData5.AdditionalService, com.tools20022.repository.msg.CommonData5.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction55.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction55.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction55.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction62.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction62.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction62.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction71.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction71.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction71.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction70.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction70.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction70.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction72.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction72.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction72.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction76.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction76.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction76.ServiceAttribute,
					com.tools20022.repository.msg.CommonData6.TransactionType, com.tools20022.repository.msg.CommonData6.AdditionalService, com.tools20022.repository.msg.CommonData6.ServiceAttribute,
					com.tools20022.repository.msg.CardPaymentTransaction69.TransactionType, com.tools20022.repository.msg.CardPaymentTransaction69.AdditionalService, com.tools20022.repository.msg.CardPaymentTransaction69.ServiceAttribute);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentService";
			definition = "Type of service provided by the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceTypeCode.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#TransactionReference
	 * TransactionIdentifier1.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#TransactionIdentification
	 * CardIndividualTransaction1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#TransactionReference
	 * CardPaymentTransactionDetails8.TransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#TransactionIdentification
	 * CardPaymentTransaction8.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#TransactionIdentification
	 * CardPaymentTransaction4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#TransactionIdentification
	 * CardPaymentTransaction17.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#TransactionIdentification
	 * CardPaymentTransaction14.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#TransactionIdentification
	 * CardPaymentTransaction7.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#TransactionIdentification
	 * CardPaymentTransaction16.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#TransactionIdentification
	 * CardPaymentTransaction20.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#TransactionIdentification
	 * CardPaymentTransaction1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#TransactionIdentification
	 * CardPaymentTransaction11.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#TransactionIdentification
	 * CardPaymentTransaction19.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#TransactionIdentification
	 * CardPaymentTransaction2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#TransactionIdentification
	 * CardPaymentTransaction12.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#TransactionIdentification
	 * CardPaymentTransaction5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#TransactionIdentification
	 * CardPaymentTransaction15.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#TransactionIdentification
	 * CardPaymentTransaction6.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#TransactionIdentification
	 * CardPaymentTransaction3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#TransactionIdentification
	 * CardPaymentTransaction13.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#InitiatorTransactionIdentification
	 * CardPaymentTransaction13.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#TransactionIdentification
	 * CardPaymentTransaction28.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#TransactionIdentification
	 * CardPaymentTransaction21.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#TransactionIdentification
	 * CardPaymentTransaction22.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#TransactionIdentification
	 * CardPaymentTransaction34.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#TransactionIdentification
	 * CardPaymentTransaction32.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#TransactionIdentification
	 * CardPaymentTransaction31.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#TransactionIdentification
	 * CardPaymentTransaction35.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction33#TransactionIdentification
	 * CardPaymentTransaction33.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#TransactionIdentification
	 * CardPaymentTransaction23.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#TransactionIdentification
	 * CardPaymentTransaction29.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#TransactionIdentification
	 * CardPaymentTransaction25.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#InitiatorTransactionIdentification
	 * CardPaymentTransaction25.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#TransactionIdentification
	 * CardPaymentTransaction30.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#TransactionIdentification
	 * CardPaymentTransaction26.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#TransactionIdentification
	 * CardIndividualTransaction2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#TransactionIdentification
	 * CardPaymentTransaction38.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#TransactionIdentification
	 * CardPaymentTransaction48.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction50#TransactionIdentification
	 * CardPaymentTransaction50.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#TransactionIdentification
	 * CardPaymentTransaction42.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#TransactionIdentification
	 * CardPaymentTransaction36.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#TransactionIdentification
	 * CardPaymentTransaction44.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#TransactionIdentification
	 * CardPaymentTransaction45.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#TransactionIdentification
	 * CardPaymentTransaction37.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#TransactionIdentification
	 * CardPaymentTransaction49.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#TransactionIdentification
	 * CardPaymentTransaction47.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#TransactionIdentification
	 * CardPaymentTransaction41.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#TransactionIdentification
	 * CardPaymentTransaction46.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionIdentification
	 * CardPaymentTransaction40.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#InitiatorTransactionIdentification
	 * CardPaymentTransaction40.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#TransactionIdentification
	 * ATMTransaction1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#InitiatorTransactionIdentification
	 * CardTransaction4.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#InitiatorTransactionIdentification
	 * CardTransaction8.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#TransactionLifeCycleIdentification
	 * CardTransaction8.TransactionLifeCycleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#AcceptorTransactionIdentification
	 * CardTransaction5.AcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#InitiatorTransactionIdentification
	 * CardTransaction5.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#InitiatorTransactionIdentification
	 * CardTransaction3.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#InitiatorIdentification
	 * CardTransaction3.InitiatorIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#AcceptorTransactionIdentification
	 * CardTransaction15.AcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#InitiatorTransactionIdentification
	 * CardTransaction15.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#AcceptorTransactionIdentification
	 * CardTransaction7.AcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#InitiatorTransactionIdentification
	 * CardTransaction7.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#TransactionIdentification
	 * CardPaymentTransaction52.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#TransactionIdentification
	 * CardPaymentTransaction63.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#TransactionIdentification
	 * CardPaymentTransaction60.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#TransactionIdentification
	 * CardPaymentTransaction57.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#TransactionIdentification
	 * CardPaymentTransaction61.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#TransactionIdentification
	 * CardPaymentTransaction64.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction65#TransactionIdentification
	 * CardPaymentTransaction65.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#TransactionIdentification
	 * CardPaymentTransaction53.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#TransactionIdentification
	 * CardPaymentTransaction59.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#TransactionIdentification
	 * CardPaymentTransaction56.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#TransactionIdentification
	 * CardPaymentTransaction51.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionIdentification
	 * CardPaymentTransaction55.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#InitiatorTransactionIdentification
	 * CardPaymentTransaction55.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#TransactionIdentification
	 * CardPaymentTransaction62.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#TransactionIdentification
	 * ATMTransaction13.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#TransactionIdentification
	 * ATMTransaction16.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#TransactionIdentification
	 * ATMTransaction19.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#TransactionIdentification
	 * ATMTransaction15.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#TransactionIdentification
	 * ATMTransaction24.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#TransactionIdentification
	 * ATMTransaction23.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#TransactionIdentification
	 * CardPaymentTransaction71.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#TransactionIdentification
	 * CardPaymentTransaction75.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#TransactionIdentification
	 * CardPaymentTransaction74.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#TransactionIdentification
	 * CardPaymentTransaction70.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#TransactionIdentification
	 * CardPaymentTransaction73.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#TransactionIdentification
	 * CardPaymentTransaction72.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#TransactionIdentification
	 * CardPaymentTransaction76.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionIdentification
	 * CardPaymentTransaction69.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#InitiatorTransactionIdentification
	 * CardPaymentTransaction69.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#TransactionIdentification
	 * CardPaymentTransaction77.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#TransactionIdentification
	 * CardPaymentTransaction78.TransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifier1.TransactionReference, com.tools20022.repository.msg.CardIndividualTransaction1.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransactionDetails8.TransactionReference, com.tools20022.repository.msg.CardPaymentTransaction8.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction4.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction17.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction14.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction7.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction16.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction20.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction1.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction11.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction19.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction2.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction12.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction5.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction15.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction6.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction3.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction13.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction13.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction28.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction21.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction22.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction34.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction32.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction31.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction35.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction33.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction23.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction29.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction25.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction25.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction30.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction26.TransactionIdentification, com.tools20022.repository.msg.CardIndividualTransaction2.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction38.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction48.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction50.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction42.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction36.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction44.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction45.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction37.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction49.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction47.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction41.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction46.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction40.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction40.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction1.TransactionIdentification, com.tools20022.repository.msg.CardTransaction4.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardTransaction8.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction8.TransactionLifeCycleIdentification,
					com.tools20022.repository.msg.CardTransaction5.AcceptorTransactionIdentification, com.tools20022.repository.msg.CardTransaction5.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardTransaction3.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction3.InitiatorIdentification,
					com.tools20022.repository.msg.CardTransaction15.AcceptorTransactionIdentification, com.tools20022.repository.msg.CardTransaction15.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardTransaction7.AcceptorTransactionIdentification, com.tools20022.repository.msg.CardTransaction7.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction52.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction63.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction60.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction57.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction61.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction64.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction65.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction53.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction59.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction56.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction51.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction55.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction55.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction62.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction13.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction16.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction19.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction15.TransactionIdentification,
					com.tools20022.repository.msg.ATMTransaction24.TransactionIdentification, com.tools20022.repository.msg.ATMTransaction23.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction71.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction75.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction74.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction70.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction73.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction72.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction76.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction69.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction69.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction77.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction78.TransactionIdentification);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Local date and time of the transaction assigned by the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#TransactionDateTime
	 * TransactionIdentifier1.TransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#TransactionDateTime
	 * CardPaymentTransactionDetails8.TransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#AcceptorTransactionDateTime
	 * CardTransaction4.AcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#AcceptorTransactionDateTime
	 * CardTransaction8.AcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#AcceptorTransactionDateTime
	 * CardTransaction5.AcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#AcceptorTransactionDateTime
	 * CardTransaction3.AcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#AcceptorTransactionDateTime
	 * CardTransaction15.AcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#AcceptorTransactionDateTime
	 * CardTransaction7.AcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#AcceptorTransactionDateTime
	 * CardTransaction6.AcceptorTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local date and time of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifier1.TransactionDateTime, com.tools20022.repository.msg.CardPaymentTransactionDetails8.TransactionDateTime,
					com.tools20022.repository.msg.CardTransaction4.AcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction8.AcceptorTransactionDateTime,
					com.tools20022.repository.msg.CardTransaction5.AcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction3.AcceptorTransactionDateTime,
					com.tools20022.repository.msg.CardTransaction15.AcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction7.AcceptorTransactionDateTime,
					com.tools20022.repository.msg.CardTransaction6.AcceptorTransactionDateTime);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionDateTime";
			definition = "Local date and time of the transaction assigned by the POI (Point Of Interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Data related to the interface of an integrated circuit card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#ICCRelatedData
	 * CardPaymentTransactionDetails8.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#ICCRelatedData
	 * CardPaymentTransactionDetails4.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#ICCRelatedData
	 * CardPaymentTransactionDetails7.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#ICCRelatedData
	 * CardPaymentTransactionDetails9.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#ICCRelatedData
	 * CardPaymentTransactionDetails1.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#ICCRelatedData
	 * CardPaymentTransactionDetails10.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#ICCRelatedData
	 * CardPaymentTransactionDetails2.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#ICCRelatedData
	 * CardPaymentTransactionDetails11.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#ICCRelatedData
	 * CardPaymentTransactionDetails5.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#ICCRelatedData
	 * CardPaymentTransactionDetails3.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount6#ICCRelatedData
	 * DetailedAmount6.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#ICCRelatedData
	 * CardPaymentTransactionDetails12.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#ICCRelatedData
	 * CardPaymentTransactionDetails13.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#ICCRelatedData
	 * CardPaymentTransactionDetails18.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#ICCRelatedData
	 * CardPaymentTransactionDetails16.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#ICCRelatedData
	 * CardPaymentTransactionDetails14.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#ICCRelatedData
	 * CardPaymentTransactionDetails15.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#ICCRelatedData
	 * CardPaymentTransactionDetails17.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#ICCRelatedData
	 * CardIndividualTransaction2.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#ICCRelatedData
	 * CardPaymentTransactionDetails20.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#ICCRelatedData
	 * CardPaymentTransactionDetails25.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#ICCRelatedData
	 * CardPaymentTransactionDetails23.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#ICCRelatedData
	 * CardPaymentTransactionDetails21.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#ICCRelatedData
	 * CardPaymentTransactionDetails26.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#ICCRelatedData
	 * CardPaymentTransactionDetails19.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#ICCRelatedData
	 * CardPaymentTransactionDetails24.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#ICCRelatedData
	 * CardPaymentTransactionDetails32.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#ICCRelatedData
	 * CardPaymentTransactionDetails33.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#ICCRelatedData
	 * CardPaymentTransactionDetails28.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#ICCRelatedData
	 * CardPaymentTransactionDetails29.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#ICCRelatedData
	 * CardPaymentTransactionDetails30.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#ICCRelatedData
	 * CardPaymentTransactionDetails27.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#ICCRelatedData
	 * CardPaymentTransactionDetails31.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount14#ICCRelatedData
	 * DetailedAmount14.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#ICCRelatedData
	 * CardPaymentTransactionDetails34.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#ICCRelatedData
	 * CardPaymentTransactionDetails39.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#ICCRelatedData
	 * CardPaymentTransactionDetails38.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#ICCRelatedData
	 * CardPaymentTransactionDetails41.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#ICCRelatedData
	 * CardPaymentTransactionDetails37.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#ICCRelatedData
	 * CardPaymentTransactionDetails40.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#ICCRelatedData
	 * CardPaymentTransactionDetails42.ICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#ICCRelatedData
	 * CardPaymentTransactionDetails43.ICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the interface of an integrated circuit card application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ICCRelatedData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails8.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails4.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails7.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails9.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails1.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails10.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails2.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails11.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails5.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails3.ICCRelatedData, com.tools20022.repository.msg.DetailedAmount6.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails13.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails18.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails16.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails14.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails15.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails17.ICCRelatedData, com.tools20022.repository.msg.CardIndividualTransaction2.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails20.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails25.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails23.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails21.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails26.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails19.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails24.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails32.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails33.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails28.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails29.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails30.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails27.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails31.ICCRelatedData, com.tools20022.repository.msg.DetailedAmount14.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails34.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails39.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails38.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails41.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails37.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails40.ICCRelatedData,
					com.tools20022.repository.msg.CardPaymentTransactionDetails42.ICCRelatedData, com.tools20022.repository.msg.CardPaymentTransactionDetails43.ICCRelatedData);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to the interface of an integrated circuit card application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Card payment which is at the origin of the acquiring process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#CardPaymentAcquiring
	 * CardPayment.CardPaymentAcquiring}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAdvice1#Transaction
	 * ATMCompletionAdvice1.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement1#Transaction
	 * ATMCompletionAcknowledgement1.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAdvice2#Transaction
	 * ATMCompletionAdvice2.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#Transaction
	 * ATMCompletionAcknowledgement2.Transaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment which is at the origin of the acquiring process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCompletionAdvice1.Transaction, com.tools20022.repository.msg.ATMCompletionAcknowledgement1.Transaction,
					com.tools20022.repository.msg.ATMCompletionAdvice2.Transaction, com.tools20022.repository.msg.ATMCompletionAcknowledgement2.Transaction);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which is at the origin of the acquiring process.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPayment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the transaction has been initiated by a card physically
	 * present or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#CardPresent
	 * PaymentContext3.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#CardPresent
	 * PaymentContext1.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#CardPresent
	 * PaymentContext4.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#CardPresent
	 * PaymentContext2.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#CardPresent
	 * PaymentContext7.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#CardPresent
	 * PaymentContext6.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#CardPresent
	 * PaymentContext5.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#CardPresent
	 * PaymentContext10.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#CardPresent
	 * PaymentContext8.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#CardPresent
	 * PaymentContext11.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#CardPresent
	 * PaymentContext13.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#CardPresent
	 * PaymentContext9.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#CardPresent
	 * PaymentContext12.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#CardPresent
	 * CardTransactionContext2.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#CardPresent
	 * PaymentContext17.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#CardPresent
	 * PaymentContext14.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#CardPresent
	 * PaymentContext18.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#CardPresent
	 * PaymentContext19.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#CardPresent
	 * PaymentContext16.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#CardPresent
	 * PaymentContext15.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#CardPresent
	 * PaymentContext22.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#CardPresent
	 * PaymentContext24.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#CardPresent
	 * PaymentContext20.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#CardPresent
	 * PaymentContext25.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#CardPresent
	 * PaymentContext21.CardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#CardPresent
	 * PaymentContext23.CardPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated by a card physically present or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardPresent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.CardPresent, com.tools20022.repository.msg.PaymentContext1.CardPresent, com.tools20022.repository.msg.PaymentContext4.CardPresent,
					com.tools20022.repository.msg.PaymentContext2.CardPresent, com.tools20022.repository.msg.PaymentContext7.CardPresent, com.tools20022.repository.msg.PaymentContext6.CardPresent,
					com.tools20022.repository.msg.PaymentContext5.CardPresent, com.tools20022.repository.msg.PaymentContext10.CardPresent, com.tools20022.repository.msg.PaymentContext8.CardPresent,
					com.tools20022.repository.msg.PaymentContext11.CardPresent, com.tools20022.repository.msg.PaymentContext13.CardPresent, com.tools20022.repository.msg.PaymentContext9.CardPresent,
					com.tools20022.repository.msg.PaymentContext12.CardPresent, com.tools20022.repository.msg.CardTransactionContext2.CardPresent, com.tools20022.repository.msg.PaymentContext17.CardPresent,
					com.tools20022.repository.msg.PaymentContext14.CardPresent, com.tools20022.repository.msg.PaymentContext18.CardPresent, com.tools20022.repository.msg.PaymentContext19.CardPresent,
					com.tools20022.repository.msg.PaymentContext16.CardPresent, com.tools20022.repository.msg.PaymentContext15.CardPresent, com.tools20022.repository.msg.PaymentContext22.CardPresent,
					com.tools20022.repository.msg.PaymentContext24.CardPresent, com.tools20022.repository.msg.PaymentContext20.CardPresent, com.tools20022.repository.msg.PaymentContext25.CardPresent,
					com.tools20022.repository.msg.PaymentContext21.CardPresent, com.tools20022.repository.msg.PaymentContext23.CardPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction has been initiated in presence of the
	 * cardholder or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#CardholderPresent
	 * PaymentContext3.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#CardholderPresent
	 * PaymentContext1.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#CardholderPresent
	 * PaymentContext4.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#CardholderPresent
	 * PaymentContext2.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#CardholderPresent
	 * PaymentContext7.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#CardholderPresent
	 * PaymentContext6.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#CardholderPresent
	 * PaymentContext5.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#CardholderPresent
	 * PaymentContext10.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#CardholderPresent
	 * PaymentContext8.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#CardholderPresent
	 * PaymentContext11.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#CardholderPresent
	 * PaymentContext13.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#CardholderPresent
	 * PaymentContext9.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#CardholderPresent
	 * PaymentContext12.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#CardholderPresent
	 * CardTransactionContext2.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#CardholderPresent
	 * PaymentContext17.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#CardholderPresent
	 * PaymentContext14.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#CardholderPresent
	 * PaymentContext18.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#CardholderPresent
	 * PaymentContext19.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#CardholderPresent
	 * PaymentContext16.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#CardholderPresent
	 * PaymentContext15.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#CardholderPresent
	 * PaymentContext22.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#CardholderPresent
	 * PaymentContext24.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#CardholderPresent
	 * PaymentContext20.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#CardholderPresent
	 * PaymentContext25.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#CardholderPresent
	 * PaymentContext21.CardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#CardholderPresent
	 * PaymentContext23.CardholderPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardholderPresent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.CardholderPresent, com.tools20022.repository.msg.PaymentContext1.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext4.CardholderPresent, com.tools20022.repository.msg.PaymentContext2.CardholderPresent, com.tools20022.repository.msg.PaymentContext7.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext6.CardholderPresent, com.tools20022.repository.msg.PaymentContext5.CardholderPresent, com.tools20022.repository.msg.PaymentContext10.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext8.CardholderPresent, com.tools20022.repository.msg.PaymentContext11.CardholderPresent, com.tools20022.repository.msg.PaymentContext13.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext9.CardholderPresent, com.tools20022.repository.msg.PaymentContext12.CardholderPresent, com.tools20022.repository.msg.CardTransactionContext2.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext17.CardholderPresent, com.tools20022.repository.msg.PaymentContext14.CardholderPresent, com.tools20022.repository.msg.PaymentContext18.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext19.CardholderPresent, com.tools20022.repository.msg.PaymentContext16.CardholderPresent, com.tools20022.repository.msg.PaymentContext15.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext22.CardholderPresent, com.tools20022.repository.msg.PaymentContext24.CardholderPresent, com.tools20022.repository.msg.PaymentContext20.CardholderPresent,
					com.tools20022.repository.msg.PaymentContext25.CardholderPresent, com.tools20022.repository.msg.PaymentContext21.CardholderPresent, com.tools20022.repository.msg.PaymentContext23.CardholderPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * On-line or off-line context of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#OnLineContext
	 * PaymentContext3.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#OnLineContext
	 * PaymentContext1.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#OnLineContext
	 * PaymentContext4.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#OnLineContext
	 * PaymentContext2.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#OnLineContext
	 * PaymentContext7.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#OnLineContext
	 * PaymentContext6.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#OnLineContext
	 * PaymentContext10.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#OnLineContext
	 * PaymentContext11.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#OnLineContext
	 * PaymentContext13.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#OnLineContext
	 * PaymentContext9.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#OnLineContext
	 * PaymentContext12.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#OnLineContext
	 * PaymentContext17.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#OnLineContext
	 * PaymentContext18.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#OnLineContext
	 * PaymentContext15.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#OnLineContext
	 * PaymentContext24.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#OnLineContext
	 * PaymentContext21.OnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#OnLineContext
	 * PaymentContext23.OnLineContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line or off-line context of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OnLineContext = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.OnLineContext, com.tools20022.repository.msg.PaymentContext1.OnLineContext, com.tools20022.repository.msg.PaymentContext4.OnLineContext,
					com.tools20022.repository.msg.PaymentContext2.OnLineContext, com.tools20022.repository.msg.PaymentContext7.OnLineContext, com.tools20022.repository.msg.PaymentContext6.OnLineContext,
					com.tools20022.repository.msg.PaymentContext10.OnLineContext, com.tools20022.repository.msg.PaymentContext11.OnLineContext, com.tools20022.repository.msg.PaymentContext13.OnLineContext,
					com.tools20022.repository.msg.PaymentContext9.OnLineContext, com.tools20022.repository.msg.PaymentContext12.OnLineContext, com.tools20022.repository.msg.PaymentContext17.OnLineContext,
					com.tools20022.repository.msg.PaymentContext18.OnLineContext, com.tools20022.repository.msg.PaymentContext15.OnLineContext, com.tools20022.repository.msg.PaymentContext24.OnLineContext,
					com.tools20022.repository.msg.PaymentContext21.OnLineContext, com.tools20022.repository.msg.PaymentContext23.OnLineContext);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Human attendance at the POI location during the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AttendanceContext
	 * PaymentContext3.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent1#AttendanceContext
	 * StatusReportContent1.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#AttendanceContext
	 * StatusReportContent2.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#AttendanceContext
	 * PaymentContext1.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#AttendanceContext
	 * PaymentContext4.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#AttendanceContext
	 * PaymentContext2.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#AttendanceContext
	 * PaymentContext7.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#AttendanceContext
	 * PaymentContext6.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#AttendanceContext
	 * PaymentContext5.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#AttendanceContext
	 * StatusReportContent3.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#AttendanceContext
	 * PaymentContext10.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#AttendanceContext
	 * PaymentContext8.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#AttendanceContext
	 * PaymentContext11.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#AttendanceContext
	 * PaymentContext13.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#AttendanceContext
	 * PaymentContext9.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#AttendanceContext
	 * PaymentContext12.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#AttendanceContext
	 * StatusReportContent4.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#AttendanceContext
	 * CardTransactionContext2.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#AttendanceContext
	 * StatusReportContent5.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#AttendanceContext
	 * PaymentContext17.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#AttendanceContext
	 * PaymentContext14.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#AttendanceContext
	 * PaymentContext18.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#AttendanceContext
	 * PaymentContext19.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#AttendanceContext
	 * PaymentContext16.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#AttendanceContext
	 * PaymentContext15.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#AttendanceContext
	 * PaymentContext22.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#AttendanceContext
	 * PaymentContext24.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#AttendanceContext
	 * PaymentContext20.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#AttendanceContext
	 * PaymentContext25.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#AttendanceContext
	 * PaymentContext21.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#AttendanceContext
	 * StatusReportContent6.AttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#AttendanceContext
	 * PaymentContext23.AttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the POI location during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AttendanceContext = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AttendanceContext, com.tools20022.repository.msg.StatusReportContent1.AttendanceContext,
					com.tools20022.repository.msg.StatusReportContent2.AttendanceContext, com.tools20022.repository.msg.PaymentContext1.AttendanceContext, com.tools20022.repository.msg.PaymentContext4.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext2.AttendanceContext, com.tools20022.repository.msg.PaymentContext7.AttendanceContext, com.tools20022.repository.msg.PaymentContext6.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext5.AttendanceContext, com.tools20022.repository.msg.StatusReportContent3.AttendanceContext, com.tools20022.repository.msg.PaymentContext10.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext8.AttendanceContext, com.tools20022.repository.msg.PaymentContext11.AttendanceContext, com.tools20022.repository.msg.PaymentContext13.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext9.AttendanceContext, com.tools20022.repository.msg.PaymentContext12.AttendanceContext, com.tools20022.repository.msg.StatusReportContent4.AttendanceContext,
					com.tools20022.repository.msg.CardTransactionContext2.AttendanceContext, com.tools20022.repository.msg.StatusReportContent5.AttendanceContext, com.tools20022.repository.msg.PaymentContext17.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext14.AttendanceContext, com.tools20022.repository.msg.PaymentContext18.AttendanceContext, com.tools20022.repository.msg.PaymentContext19.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext16.AttendanceContext, com.tools20022.repository.msg.PaymentContext15.AttendanceContext, com.tools20022.repository.msg.PaymentContext22.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext24.AttendanceContext, com.tools20022.repository.msg.PaymentContext20.AttendanceContext, com.tools20022.repository.msg.PaymentContext25.AttendanceContext,
					com.tools20022.repository.msg.PaymentContext21.AttendanceContext, com.tools20022.repository.msg.StatusReportContent6.AttendanceContext, com.tools20022.repository.msg.PaymentContext23.AttendanceContext);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI location during the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AttendanceContextCode.mmObject();
		}
	};
	/**
	 * Indicates the environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#TransactionEnvironment
	 * PaymentContext3.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#TransactionEnvironment
	 * PaymentContext1.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#TransactionEnvironment
	 * PaymentContext4.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#TransactionEnvironment
	 * PaymentContext2.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#TransactionEnvironment
	 * PaymentContext7.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#TransactionEnvironment
	 * PaymentContext6.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#TransactionEnvironment
	 * PaymentContext5.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#TransactionEnvironment
	 * PaymentContext10.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#TransactionEnvironment
	 * PaymentContext8.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#TransactionEnvironment
	 * PaymentContext11.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#TransactionEnvironment
	 * PaymentContext13.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#TransactionEnvironment
	 * PaymentContext9.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#TransactionEnvironment
	 * PaymentContext12.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#TransactionEnvironment
	 * CardTransactionContext2.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#TransactionEnvironment
	 * PaymentContext17.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#TransactionEnvironment
	 * PaymentContext14.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#TransactionEnvironment
	 * PaymentContext18.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#TransactionEnvironment
	 * PaymentContext19.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#TransactionEnvironment
	 * PaymentContext16.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#TransactionEnvironment
	 * PaymentContext15.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#TransactionEnvironment
	 * PaymentContext22.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#TransactionEnvironment
	 * PaymentContext24.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#TransactionEnvironment
	 * PaymentContext20.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#TransactionEnvironment
	 * PaymentContext25.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#TransactionEnvironment
	 * PaymentContext21.TransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#TransactionEnvironment
	 * PaymentContext23.TransactionEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionEnvironment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext1.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext4.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext2.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext7.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext6.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext5.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext10.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext8.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext11.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext13.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext9.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext12.TransactionEnvironment, com.tools20022.repository.msg.CardTransactionContext2.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext17.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext14.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext18.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext19.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext16.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext15.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext22.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext24.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext20.TransactionEnvironment,
					com.tools20022.repository.msg.PaymentContext25.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext21.TransactionEnvironment, com.tools20022.repository.msg.PaymentContext23.TransactionEnvironment);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionEnvironmentCode.mmObject();
		}
	};
	/**
	 * Identifies the type of the communication channels used by the cardholder
	 * to the acceptor system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#TransactionChannel
	 * PaymentContext3.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#TransactionChannel
	 * PaymentContext1.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#TransactionChannel
	 * PaymentContext4.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#TransactionChannel
	 * PaymentContext2.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#TransactionChannel
	 * PaymentContext7.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#TransactionChannel
	 * PaymentContext6.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#TransactionChannel
	 * PaymentContext5.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#TransactionChannel
	 * PaymentContext10.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#TransactionChannel
	 * PaymentContext8.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#TransactionChannel
	 * PaymentContext11.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#TransactionChannel
	 * PaymentContext13.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#TransactionChannel
	 * PaymentContext9.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#TransactionChannel
	 * PaymentContext12.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#TransactionChannel
	 * CardTransactionContext2.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#TransactionChannel
	 * PaymentContext17.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#TransactionChannel
	 * PaymentContext14.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#TransactionChannel
	 * PaymentContext18.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#TransactionChannel
	 * PaymentContext19.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#TransactionChannel
	 * PaymentContext16.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#TransactionChannel
	 * PaymentContext15.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#TransactionChannel
	 * PaymentContext22.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#TransactionChannel
	 * PaymentContext24.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#TransactionChannel
	 * PaymentContext20.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#TransactionChannel
	 * PaymentContext25.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#TransactionChannel
	 * PaymentContext21.TransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#TransactionChannel
	 * PaymentContext23.TransactionChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.TransactionChannel, com.tools20022.repository.msg.PaymentContext1.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext4.TransactionChannel, com.tools20022.repository.msg.PaymentContext2.TransactionChannel, com.tools20022.repository.msg.PaymentContext7.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext6.TransactionChannel, com.tools20022.repository.msg.PaymentContext5.TransactionChannel, com.tools20022.repository.msg.PaymentContext10.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext8.TransactionChannel, com.tools20022.repository.msg.PaymentContext11.TransactionChannel, com.tools20022.repository.msg.PaymentContext13.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext9.TransactionChannel, com.tools20022.repository.msg.PaymentContext12.TransactionChannel, com.tools20022.repository.msg.CardTransactionContext2.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext17.TransactionChannel, com.tools20022.repository.msg.PaymentContext14.TransactionChannel, com.tools20022.repository.msg.PaymentContext18.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext19.TransactionChannel, com.tools20022.repository.msg.PaymentContext16.TransactionChannel, com.tools20022.repository.msg.PaymentContext15.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext22.TransactionChannel, com.tools20022.repository.msg.PaymentContext24.TransactionChannel, com.tools20022.repository.msg.PaymentContext20.TransactionChannel,
					com.tools20022.repository.msg.PaymentContext25.TransactionChannel, com.tools20022.repository.msg.PaymentContext21.TransactionChannel, com.tools20022.repository.msg.PaymentContext23.TransactionChannel);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}
	};
	/**
	 * Indicates whether a message can be sent or not on an attendant display
	 * (attendant display present or not).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AttendantMessageCapable
	 * PaymentContext3.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#AttendantMessageCapable
	 * PaymentContext1.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#AttendantMessageCapable
	 * PaymentContext4.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#AttendantMessageCapable
	 * PaymentContext7.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#AttendantMessageCapable
	 * PaymentContext5.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#AttendantMessageCapable
	 * PaymentContext10.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#AttendantMessageCapable
	 * PaymentContext8.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#AttendantMessageCapable
	 * PaymentContext13.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#AttendantMessageCapable
	 * PaymentContext12.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#AttendantMessageCapable
	 * PaymentContext14.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#AttendantMessageCapable
	 * PaymentContext18.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#AttendantMessageCapable
	 * PaymentContext19.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#AttendantMessageCapable
	 * PaymentContext16.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#AttendantMessageCapable
	 * PaymentContext22.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#AttendantMessageCapable
	 * PaymentContext24.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#AttendantMessageCapable
	 * PaymentContext20.AttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#AttendantMessageCapable
	 * PaymentContext25.AttendantMessageCapable}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantMessageCapable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a message can be sent or not on an attendant display (attendant display present or not)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AttendantMessageCapable = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext1.AttendantMessageCapable,
					com.tools20022.repository.msg.PaymentContext4.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext7.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext5.AttendantMessageCapable,
					com.tools20022.repository.msg.PaymentContext10.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext8.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext13.AttendantMessageCapable,
					com.tools20022.repository.msg.PaymentContext12.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext14.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext18.AttendantMessageCapable,
					com.tools20022.repository.msg.PaymentContext19.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext16.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext22.AttendantMessageCapable,
					com.tools20022.repository.msg.PaymentContext24.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext20.AttendantMessageCapable, com.tools20022.repository.msg.PaymentContext25.AttendantMessageCapable);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Language used to display messages to the attendant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AttendantLanguage
	 * PaymentContext3.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#AttendantLanguage
	 * PaymentContext1.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#AttendantLanguage
	 * PaymentContext4.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#AttendantLanguage
	 * PaymentContext7.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#AttendantLanguage
	 * PaymentContext5.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#AttendantLanguage
	 * PaymentContext10.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#AttendantLanguage
	 * PaymentContext8.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#AttendantLanguage
	 * PaymentContext13.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#AttendantLanguage
	 * PaymentContext12.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#AttendantLanguage
	 * PaymentContext14.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#AttendantLanguage
	 * PaymentContext18.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#AttendantLanguage
	 * PaymentContext19.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#AttendantLanguage
	 * PaymentContext16.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#AttendantLanguage
	 * PaymentContext22.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#AttendantLanguage
	 * PaymentContext24.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#AttendantLanguage
	 * PaymentContext20.AttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#AttendantLanguage
	 * PaymentContext25.AttendantLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used to display messages to the attendant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AttendantLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AttendantLanguage, com.tools20022.repository.msg.PaymentContext1.AttendantLanguage,
					com.tools20022.repository.msg.PaymentContext4.AttendantLanguage, com.tools20022.repository.msg.PaymentContext7.AttendantLanguage, com.tools20022.repository.msg.PaymentContext5.AttendantLanguage,
					com.tools20022.repository.msg.PaymentContext10.AttendantLanguage, com.tools20022.repository.msg.PaymentContext8.AttendantLanguage, com.tools20022.repository.msg.PaymentContext13.AttendantLanguage,
					com.tools20022.repository.msg.PaymentContext12.AttendantLanguage, com.tools20022.repository.msg.PaymentContext14.AttendantLanguage, com.tools20022.repository.msg.PaymentContext18.AttendantLanguage,
					com.tools20022.repository.msg.PaymentContext19.AttendantLanguage, com.tools20022.repository.msg.PaymentContext16.AttendantLanguage, com.tools20022.repository.msg.PaymentContext22.AttendantLanguage,
					com.tools20022.repository.msg.PaymentContext24.AttendantLanguage, com.tools20022.repository.msg.PaymentContext20.AttendantLanguage, com.tools20022.repository.msg.PaymentContext25.AttendantLanguage);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	/**
	 * Entry mode of the card data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
	 * CardDataReadingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#CardDataEntryMode
	 * PaymentContext3.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#CardDataEntryMode
	 * PaymentContext1.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#CardDataEntryMode
	 * PaymentContext4.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#CardDataEntryMode
	 * PaymentContext2.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#CardDataEntryMode
	 * PaymentContext7.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#CardDataEntryMode
	 * PaymentContext6.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#CardDataEntryMode
	 * PaymentContext5.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#CardDataEntryMode
	 * PaymentContext10.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#CardDataEntryMode
	 * PaymentContext8.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#CardDataEntryMode
	 * PaymentContext11.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#CardDataEntryMode
	 * PaymentContext13.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#CardDataEntryMode
	 * PaymentContext9.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#CardDataEntryMode
	 * PaymentContext12.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#CardDataEntryMode
	 * CardTransactionContext2.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#CardDataEntryMode
	 * PaymentContext17.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#CardDataEntryMode
	 * PaymentContext14.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#CardDataEntryMode
	 * PaymentContext18.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#CardDataEntryMode
	 * PaymentContext19.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#CardDataEntryMode
	 * PaymentContext16.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#CardDataEntryMode
	 * PaymentContext15.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#CardDataEntryMode
	 * PaymentContext22.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#CardDataEntryMode
	 * PaymentContext24.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#CardDataEntryMode
	 * PaymentContext20.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#CardDataEntryMode
	 * PaymentContext25.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#CardDataEntryMode
	 * PaymentContext21.CardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#CardDataEntryMode
	 * PaymentContext23.CardDataEntryMode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the card data."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardDataEntryMode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext1.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext4.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext2.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext7.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext6.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext5.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext10.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext8.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext11.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext13.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext9.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext12.CardDataEntryMode, com.tools20022.repository.msg.CardTransactionContext2.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext17.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext14.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext18.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext19.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext16.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext15.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext22.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext24.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext20.CardDataEntryMode,
					com.tools20022.repository.msg.PaymentContext25.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext21.CardDataEntryMode, com.tools20022.repository.msg.PaymentContext23.CardDataEntryMode);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}
	};
	/**
	 * Indicator of a transaction fallback.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#FallbackIndicator
	 * PaymentContext3.FallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#FallbackIndicator
	 * PaymentContext1.FallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#FallbackIndicator
	 * PaymentContext4.FallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#FallbackIndicator
	 * PaymentContext2.FallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#FallbackIndicator
	 * PaymentContext7.FallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#FallbackIndicator
	 * PaymentContext6.FallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#FallbackIndicator
	 * PaymentContext5.FallbackIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator of a transaction fallback."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FallbackIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.FallbackIndicator, com.tools20022.repository.msg.PaymentContext1.FallbackIndicator,
					com.tools20022.repository.msg.PaymentContext4.FallbackIndicator, com.tools20022.repository.msg.PaymentContext2.FallbackIndicator, com.tools20022.repository.msg.PaymentContext7.FallbackIndicator,
					com.tools20022.repository.msg.PaymentContext6.FallbackIndicator, com.tools20022.repository.msg.PaymentContext5.FallbackIndicator);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a transaction fallback.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Instructs the POI (Point Of Interaction) how to contact the host of the
	 * terminal management system (TMS), to initiate the maintenance of the
	 * terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#CardPaymentAcquiring
	 * TerminalManagementSystem.CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse1#TMSTrigger
	 * AcceptorDiagnosticResponse1.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse2#TMSTrigger
	 * AcceptorDiagnosticResponse2.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#TMSTrigger
	 * AuthorisationResult1.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#TMSTrigger
	 * AuthorisationResult3.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1#TMSTrigger
	 * AcceptorCancellationAdviceResponse1.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2#TMSTrigger
	 * AcceptorCancellationAdviceResponse2.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#TMSTrigger
	 * AcceptorCompletionAdviceResponse1.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2#TMSTrigger
	 * AcceptorCompletionAdviceResponse2.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3#TMSTrigger
	 * AcceptorDiagnosticResponse3.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#TMSTrigger
	 * AcceptorCancellationAdviceResponse3.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3#TMSTrigger
	 * AcceptorCompletionAdviceResponse3.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#TMSTrigger
	 * AcceptorDiagnosticResponse4.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#TMSTrigger
	 * AcceptorCancellationAdviceResponse4.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4#TMSTrigger
	 * AcceptorCompletionAdviceResponse4.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#TMSTrigger
	 * AuthorisationResult4.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#TMSTrigger
	 * AuthorisationResult6.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#TMSTrigger
	 * AcceptorCancellationAdviceResponse5.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5#TMSTrigger
	 * AcceptorCompletionAdviceResponse5.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#TMSTrigger
	 * AuthorisationResult12.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#TMSTrigger
	 * AuthorisationResult10.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#TMSTrigger
	 * AcceptorCancellationAdviceResponse6.TMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#TMSTrigger
	 * AcceptorCompletionAdviceResponse6.TMSTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TMSTrigger = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorDiagnosticResponse1.TMSTrigger, com.tools20022.repository.msg.AcceptorDiagnosticResponse2.TMSTrigger,
					com.tools20022.repository.msg.AuthorisationResult1.TMSTrigger, com.tools20022.repository.msg.AuthorisationResult3.TMSTrigger, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1.TMSTrigger,
					com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2.TMSTrigger, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.TMSTrigger,
					com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2.TMSTrigger, com.tools20022.repository.msg.AcceptorDiagnosticResponse3.TMSTrigger,
					com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3.TMSTrigger, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3.TMSTrigger,
					com.tools20022.repository.msg.AcceptorDiagnosticResponse4.TMSTrigger, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.TMSTrigger,
					com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4.TMSTrigger, com.tools20022.repository.msg.AuthorisationResult4.TMSTrigger, com.tools20022.repository.msg.AuthorisationResult6.TMSTrigger,
					com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5.TMSTrigger, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5.TMSTrigger, com.tools20022.repository.msg.AuthorisationResult12.TMSTrigger,
					com.tools20022.repository.msg.AuthorisationResult10.TMSTrigger, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.TMSTrigger, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6.TMSTrigger);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TMSTrigger";
			definition = "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.";
			minOccurs = 0;
			type_lazy = () -> TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the transaction assigned by the initiating party for
	 * the recipient party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#InitiatorTransactionIdentification
	 * CardPaymentTransaction8.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#InitiatorTransactionIdentification
	 * CardPaymentTransaction4.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#InitiatorTransactionIdentification
	 * CardPaymentTransaction17.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#InitiatorTransactionIdentification
	 * CardPaymentTransaction14.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#InitiatorTransactionIdentification
	 * CardPaymentTransaction1.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#InitiatorTransactionIdentification
	 * CardPaymentTransaction11.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#InitiatorTransactionIdentification
	 * CardPaymentTransaction19.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#InitiatorTransactionIdentification
	 * CardPaymentTransaction3.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#InitiatorTransactionIdentification
	 * CardPaymentTransaction21.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#InitiatorTransactionIdentification
	 * CardPaymentTransaction22.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#InitiatorTransactionIdentification
	 * CardPaymentTransaction31.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#InitiatorTransactionIdentification
	 * CardPaymentTransaction29.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#InitiatorTransactionIdentification
	 * CardPaymentTransaction36.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#InitiatorTransactionIdentification
	 * CardPaymentTransaction45.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#InitiatorTransactionIdentification
	 * CardPaymentTransaction37.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#InitiatorTransactionIdentification
	 * CardPaymentTransaction47.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#InitiatorTransactionIdentification
	 * CardTransaction10.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#InitiatorTransactionIdentification
	 * CardTransaction9.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#InitiatorTransactionIdentification
	 * CardTransaction6.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#InitiatorTransactionIdentification
	 * CardPaymentTransaction52.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#InitiatorTransactionIdentification
	 * CardPaymentTransaction60.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#InitiatorTransactionIdentification
	 * CardPaymentTransaction51.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#InitiatorTransactionIdentification
	 * CardPaymentTransaction62.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#InitiatorTransactionIdentification
	 * CardPaymentTransaction71.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#InitiatorTransactionIdentification
	 * CardPaymentTransaction70.InitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#InitiatorTransactionIdentification
	 * CardPaymentTransaction76.InitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the initiating party for the recipient party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitiatorTransactionIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction8.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction4.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction17.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction14.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction1.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction11.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction19.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction3.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction21.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction22.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction31.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction29.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction36.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction45.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction37.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction47.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardTransaction10.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction9.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardTransaction6.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction52.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction60.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction51.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction62.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction71.InitiatorTransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction70.InitiatorTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction76.InitiatorTransactionIdentification);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitiatorTransactionIdentifier";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Notify that a previous transaction has to be reversed if this original
	 * transaction has been approved by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#Reversal
	 * CardPaymentTransaction4.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#Reversal
	 * CardPaymentTransaction14.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#Reversal
	 * CardPaymentTransaction7.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#Reversal
	 * CardPaymentTransaction16.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#Reversal
	 * CardPaymentTransaction20.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#Reversal
	 * CardPaymentTransaction3.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#Reversal
	 * CardPaymentTransaction13.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#Reversal
	 * CardPaymentTransaction28.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#Reversal
	 * CardPaymentTransaction29.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#Reversal
	 * CardPaymentTransaction25.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#Reversal
	 * CardPaymentTransaction30.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#Reversal
	 * CardPaymentTransaction44.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#Reversal
	 * CardPaymentTransaction45.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#Reversal
	 * CardPaymentTransaction46.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#Reversal
	 * CardPaymentTransaction40.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#Reversal
	 * CardPaymentTransaction60.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#Reversal
	 * CardPaymentTransaction61.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#Reversal
	 * CardPaymentTransaction59.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#Reversal
	 * CardPaymentTransaction55.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#Reversal
	 * CardPaymentTransaction75.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#Reversal
	 * CardPaymentTransaction70.Reversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#Reversal
	 * CardPaymentTransaction69.Reversal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reversal = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction4.Reversal, com.tools20022.repository.msg.CardPaymentTransaction14.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction7.Reversal, com.tools20022.repository.msg.CardPaymentTransaction16.Reversal, com.tools20022.repository.msg.CardPaymentTransaction20.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction3.Reversal, com.tools20022.repository.msg.CardPaymentTransaction13.Reversal, com.tools20022.repository.msg.CardPaymentTransaction28.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction29.Reversal, com.tools20022.repository.msg.CardPaymentTransaction25.Reversal, com.tools20022.repository.msg.CardPaymentTransaction30.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction44.Reversal, com.tools20022.repository.msg.CardPaymentTransaction45.Reversal, com.tools20022.repository.msg.CardPaymentTransaction46.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction40.Reversal, com.tools20022.repository.msg.CardPaymentTransaction60.Reversal, com.tools20022.repository.msg.CardPaymentTransaction61.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction59.Reversal, com.tools20022.repository.msg.CardPaymentTransaction55.Reversal, com.tools20022.repository.msg.CardPaymentTransaction75.Reversal,
					com.tools20022.repository.msg.CardPaymentTransaction70.Reversal, com.tools20022.repository.msg.CardPaymentTransaction69.Reversal);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Interchange information related to the card scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#InterchangeData
	 * CardPaymentTransaction4.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#InterchangeData
	 * CardPaymentTransaction14.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#InterchangeData
	 * CardPaymentTransaction7.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#InterchangeData
	 * CardPaymentTransaction16.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#InterchangeData
	 * CardPaymentTransaction20.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#InterchangeData
	 * CardPaymentTransaction2.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#InterchangeData
	 * CardPaymentTransaction12.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#InterchangeData
	 * CardPaymentTransaction6.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#InterchangeData
	 * CardPaymentTransaction3.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#InterchangeData
	 * CardPaymentTransaction13.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#InterchangeData
	 * CardPaymentTransaction28.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#InterchangeData
	 * CardPaymentTransaction32.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#InterchangeData
	 * CardPaymentTransaction35.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#InterchangeData
	 * CardPaymentTransaction23.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#InterchangeData
	 * CardPaymentTransaction29.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#InterchangeData
	 * CardPaymentTransaction25.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#InterchangeData
	 * CardPaymentTransaction30.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#InterchangeData
	 * CardPaymentTransaction38.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#InterchangeData
	 * CardPaymentTransaction48.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#InterchangeData
	 * CardPaymentTransaction42.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#InterchangeData
	 * CardPaymentTransaction44.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#InterchangeData
	 * CardPaymentTransaction45.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#InterchangeData
	 * CardPaymentTransaction46.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#InterchangeData
	 * CardPaymentTransaction40.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#InterchangeData
	 * CardPaymentTransaction63.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#InterchangeData
	 * CardPaymentTransaction60.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#InterchangeData
	 * CardPaymentTransaction57.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#InterchangeData
	 * CardPaymentTransaction61.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#InterchangeData
	 * CardPaymentTransaction53.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#InterchangeData
	 * CardPaymentTransaction59.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#InterchangeData
	 * CardPaymentTransaction55.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#InterchangeData
	 * CardPaymentTransaction75.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#InterchangeData
	 * CardPaymentTransaction70.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#InterchangeData
	 * CardPaymentTransaction69.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#InterchangeData
	 * CardPaymentTransaction77.InterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#InterchangeData
	 * CardPaymentTransaction78.InterchangeData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interchange information related to the card scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterchangeData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction4.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction14.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction7.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction16.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction20.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction2.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction12.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction6.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction3.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction13.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction28.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction32.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction35.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction23.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction29.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction25.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction30.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction38.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction48.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction42.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction44.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction45.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction46.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction40.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction63.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction60.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction57.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction61.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction53.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction59.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction55.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction75.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction70.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction69.InterchangeData, com.tools20022.repository.msg.CardPaymentTransaction77.InterchangeData,
					com.tools20022.repository.msg.CardPaymentTransaction78.InterchangeData);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Transaction category level on an unattended POI (Point Of Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#UnattendedLevelCategory
	 * CardPaymentTransactionDetails4.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#UnattendedLevelCategory
	 * CardPaymentTransactionDetails1.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#UnattendedLevelCategory
	 * CardPaymentTransactionDetails10.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#UnattendedLevelCategory
	 * CardPaymentTransactionDetails3.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#UnattendedLevelCategory
	 * CardPaymentTransactionDetails12.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#UnattendedLevelCategory
	 * CardPaymentTransactionDetails16.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#UnattendedLevelCategory
	 * CardPaymentTransactionDetails14.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#UnattendedLevelCategory
	 * CardPaymentTransactionDetails15.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#UnattendedLevelCategory
	 * CardPaymentTransactionDetails23.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#UnattendedLevelCategory
	 * CardPaymentTransactionDetails21.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#UnattendedLevelCategory
	 * CardPaymentTransactionDetails19.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#UnattendedLevelCategory
	 * CardPaymentTransactionDetails24.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#UnattendedLevelCategory
	 * CardTransactionDetail1.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#UnattendedLevelCategory
	 * CardPaymentTransactionDetails29.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#UnattendedLevelCategory
	 * CardPaymentTransactionDetails30.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#UnattendedLevelCategory
	 * CardPaymentTransactionDetails27.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#UnattendedLevelCategory
	 * CardPaymentTransactionDetails31.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#UnattendedLevelCategory
	 * CardPaymentTransactionDetails39.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#UnattendedLevelCategory
	 * CardPaymentTransactionDetails38.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#UnattendedLevelCategory
	 * CardPaymentTransactionDetails41.UnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#UnattendedLevelCategory
	 * CardPaymentTransactionDetails37.UnattendedLevelCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedLevelCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction category level on an unattended POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnattendedLevelCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails4.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails1.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails10.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails3.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails16.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails14.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails15.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails23.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails21.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails19.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails24.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardTransactionDetail1.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails29.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails30.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails27.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails31.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails39.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails38.UnattendedLevelCategory, com.tools20022.repository.msg.CardPaymentTransactionDetails41.UnattendedLevelCategory,
					com.tools20022.repository.msg.CardPaymentTransactionDetails37.UnattendedLevelCategory);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	/**
	 * Results and parameters of the card payment verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardPayment
	 * CardPaymentValidation.CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#AuthorisationResult
	 * CardPaymentTransaction4.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#AuthorisationResult
	 * CardPaymentTransaction14.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#AuthorisationResult
	 * CardPaymentTransaction7.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#AuthorisationResult
	 * CardPaymentTransaction16.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#AuthorisationResult
	 * CardPaymentTransaction20.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#AuthorisationResult
	 * CardPaymentTransaction9.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#AuthorisationResult
	 * CardPaymentTransaction18.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction10#AuthorisationResult
	 * CardPaymentTransaction10.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#AuthorisationResult
	 * CardPaymentTransaction3.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#AuthorisationResult
	 * CardPaymentTransaction13.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#AuthorisationResult
	 * CardPaymentTransaction28.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction27#AuthorisationResult
	 * CardPaymentTransaction27.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#AuthorisationResult
	 * CardPaymentTransaction24.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#AuthorisationResult
	 * CardPaymentTransaction29.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#AuthorisationResult
	 * CardPaymentTransaction25.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#AuthorisationResult
	 * CardPaymentTransaction30.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#AuthorisationResult
	 * CardPaymentTransaction39.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction43#AuthorisationResult
	 * CardPaymentTransaction43.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#AuthorisationResult
	 * CardPaymentTransaction44.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#AuthorisationResult
	 * CardPaymentTransaction45.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#AuthorisationResult
	 * CardPaymentTransaction46.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#AuthorisationResult
	 * CardPaymentTransaction40.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#AuthorisationResult
	 * ATMTransaction5.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#AuthorisationResult
	 * ATMTransaction2.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#AuthorisationResult
	 * ATMTransaction3.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#AuthorisationResult
	 * CardTransaction5.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#AuthorisationResult
	 * CardTransaction15.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#AuthorisationResult
	 * CardPaymentTransaction60.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#AuthorisationResult
	 * CardPaymentTransaction61.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#AuthorisationResult
	 * CardPaymentTransaction59.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#AuthorisationResult
	 * CardPaymentTransaction54.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#AuthorisationResult
	 * CardPaymentTransaction55.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction58#AuthorisationResult
	 * CardPaymentTransaction58.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#AuthorisationResult
	 * ATMTransaction14.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#AuthorisationResult
	 * ATMTransaction17.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#AuthorisationResult
	 * ATMTransaction20.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#AuthorisationResult
	 * CardPaymentTransaction75.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#AuthorisationResult
	 * CardPaymentTransaction67.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#AuthorisationResult
	 * CardPaymentTransaction70.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction68#AuthorisationResult
	 * CardPaymentTransaction68.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#AuthorisationResult
	 * CardPaymentTransaction69.AuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Results and parameters of the card payment verification."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Validation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction4.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction14.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction7.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction16.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction20.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction9.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction18.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction10.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction3.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction13.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction28.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction27.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction24.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction29.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction25.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction30.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction39.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction43.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction44.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction45.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction46.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction40.AuthorisationResult, com.tools20022.repository.msg.ATMTransaction5.AuthorisationResult,
					com.tools20022.repository.msg.ATMTransaction2.AuthorisationResult, com.tools20022.repository.msg.ATMTransaction3.AuthorisationResult, com.tools20022.repository.msg.CardTransaction5.AuthorisationResult,
					com.tools20022.repository.msg.CardTransaction15.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction60.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction61.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction59.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction54.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction55.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction58.AuthorisationResult, com.tools20022.repository.msg.ATMTransaction14.AuthorisationResult, com.tools20022.repository.msg.ATMTransaction17.AuthorisationResult,
					com.tools20022.repository.msg.ATMTransaction20.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction75.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction67.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction70.AuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction68.AuthorisationResult,
					com.tools20022.repository.msg.CardPaymentTransaction69.AuthorisationResult);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Validation";
			definition = "Results and parameters of the card payment verification.";
			minOccurs = 0;
			type_lazy = () -> CardPaymentValidation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the acquirer requires a further exchange after the
	 * completion of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#CompletionRequired
	 * AuthorisationResult1.CompletionRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#CompletionRequired
	 * AuthorisationResult4.CompletionRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#CompletionRequired
	 * AuthorisationResult10.CompletionRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the acquirer requires a further exchange after the completion of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CompletionRequired = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorisationResult1.CompletionRequired, com.tools20022.repository.msg.AuthorisationResult4.CompletionRequired,
					com.tools20022.repository.msg.AuthorisationResult10.CompletionRequired);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompletionRequired";
			definition = "Indicates whether the acquirer requires a further exchange after the completion of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Type of action to be performed by the POI (Point Of Interaction) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Action1#ActionType
	 * Action1.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action2#ActionType
	 * Action2.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action3#ActionType
	 * Action3.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action4#ActionType
	 * Action4.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action5#ActionType
	 * Action5.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action6#ActionType
	 * Action6.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action7#ActionType
	 * Action7.ActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action8#ActionType
	 * Action8.ActionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of action to be performed by the POI (Point Of Interaction) system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Action1.ActionType, com.tools20022.repository.msg.Action2.ActionType, com.tools20022.repository.msg.Action3.ActionType,
					com.tools20022.repository.msg.Action4.ActionType, com.tools20022.repository.msg.Action5.ActionType, com.tools20022.repository.msg.Action6.ActionType, com.tools20022.repository.msg.Action7.ActionType,
					com.tools20022.repository.msg.Action8.ActionType);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionType";
			definition = "Type of action to be performed by the POI (Point Of Interaction) system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActionTypeCode.mmObject();
		}
	};
	/**
	 * Message to be displayed or printed to the cardholder or the cashier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1#MessageContent
	 * ActionMessage1.MessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action1#MessageToPresent
	 * Action1.MessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action2#MessageToPresent
	 * Action2.MessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action3#MessageToPresent
	 * Action3.MessageToPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#MessageContent
	 * ActionMessage2.MessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action4#MessageToPresent
	 * Action4.MessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action5#MessageToPresent
	 * Action5.MessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#Message
	 * ActionMessage4.Message}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3#Content
	 * ActionMessage3.Content}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage5#MessageContent
	 * ActionMessage5.MessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action6#MessageToPresent
	 * Action6.MessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action7#MessageToPresent
	 * Action7.MessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action8#MessageToPresent
	 * Action8.MessageToPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to be displayed or printed to the cardholder or the cashier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ActionMessage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ActionMessage1.MessageContent, com.tools20022.repository.msg.Action1.MessageToPresent, com.tools20022.repository.msg.Action2.MessageToPresent,
					com.tools20022.repository.msg.Action3.MessageToPresent, com.tools20022.repository.msg.ActionMessage2.MessageContent, com.tools20022.repository.msg.Action4.MessageToPresent,
					com.tools20022.repository.msg.Action5.MessageToPresent, com.tools20022.repository.msg.ActionMessage4.Message, com.tools20022.repository.msg.ActionMessage3.Content,
					com.tools20022.repository.msg.ActionMessage5.MessageContent, com.tools20022.repository.msg.Action6.MessageToPresent, com.tools20022.repository.msg.Action7.MessageToPresent,
					com.tools20022.repository.msg.Action8.MessageToPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionMessage";
			definition = "Message to be displayed or printed to the cardholder or the cashier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction is captured or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transaction is captured or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CaptureIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaptureIndicator";
			definition = "Indicates whether the transaction is captured or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the recipient party for the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the recipient party for the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RecipientTransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Location category of the place where the merchant actually performed the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
	 * LocationCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#LocationCategory
	 * CardTransactionContext2.LocationCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location category of the place where the merchant actually performed the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Location = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionContext2.LocationCategory);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LocationCategoryCode.mmObject();
		}
	};
	/**
	 * Country of the merchant where the transaction took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#RelatedCardPayment
	 * Country.RelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the merchant where the transaction took place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the merchant where the transaction took place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentAcquiring";
				definition = "Payment processes initiated by a payment card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.RelatedCardPayment, com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring,
						com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring,
						com.tools20022.repository.entity.CardPaymentValidation.CardPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentContext3.PaymentContext, com.tools20022.repository.msg.CardPaymentContext3.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext4.PaymentContext, com.tools20022.repository.msg.CardPaymentContext4.SaleContext, com.tools20022.repository.msg.CardPaymentContext1.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext1.SaleContext, com.tools20022.repository.msg.CardPaymentContext2.PaymentContext, com.tools20022.repository.msg.CardPaymentContext2.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext7.PaymentContext, com.tools20022.repository.msg.CardPaymentContext7.SaleContext, com.tools20022.repository.msg.CardPaymentContext6.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext6.SaleContext, com.tools20022.repository.msg.CardPaymentContext5.PaymentContext, com.tools20022.repository.msg.CardPaymentContext5.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext8.PaymentContext, com.tools20022.repository.msg.CardPaymentContext8.SaleContext, com.tools20022.repository.msg.CardPaymentContext11.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext11.SaleContext, com.tools20022.repository.msg.CardPaymentContext13.PaymentContext, com.tools20022.repository.msg.CardPaymentContext13.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext9.PaymentContext, com.tools20022.repository.msg.CardPaymentContext9.SaleContext, com.tools20022.repository.msg.CardPaymentContext12.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext12.SaleContext, com.tools20022.repository.msg.CardPaymentContext10.PaymentContext, com.tools20022.repository.msg.CardPaymentContext10.SaleContext,
						com.tools20022.repository.msg.AuthorisationResult8.Action, com.tools20022.repository.msg.CardTransactionContext3.TransactionContext, com.tools20022.repository.msg.CardTransactionContext1.TransactionContext,
						com.tools20022.repository.msg.CardTransactionContext1.SaleContext, com.tools20022.repository.msg.CardTransaction6.Reconciliation, com.tools20022.repository.msg.CardPaymentContext18.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext18.SaleContext, com.tools20022.repository.msg.CardPaymentContext14.PaymentContext, com.tools20022.repository.msg.CardPaymentContext14.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext17.PaymentContext, com.tools20022.repository.msg.CardPaymentContext17.SaleContext, com.tools20022.repository.msg.CardPaymentContext19.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext19.SaleContext, com.tools20022.repository.msg.CardPaymentContext16.PaymentContext, com.tools20022.repository.msg.CardPaymentContext16.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext15.PaymentContext, com.tools20022.repository.msg.CardPaymentContext15.SaleContext, com.tools20022.repository.msg.CardPaymentContext25.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext25.SaleContext, com.tools20022.repository.msg.CardPaymentContext24.PaymentContext, com.tools20022.repository.msg.CardPaymentContext24.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext20.PaymentContext, com.tools20022.repository.msg.CardPaymentContext20.SaleContext, com.tools20022.repository.msg.CardPaymentContext21.PaymentContext,
						com.tools20022.repository.msg.CardPaymentContext21.SaleContext, com.tools20022.repository.msg.CardPaymentContext22.PaymentContext, com.tools20022.repository.msg.CardPaymentContext22.SaleContext,
						com.tools20022.repository.msg.CardPaymentContext23.PaymentContext, com.tools20022.repository.msg.CardPaymentContext23.SaleContext);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction, com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService,
						com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification, com.tools20022.repository.entity.CardPaymentAcquiring.TransactionDateTime,
						com.tools20022.repository.entity.CardPaymentAcquiring.ICCRelatedData, com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment, com.tools20022.repository.entity.CardPaymentAcquiring.CardPresent,
						com.tools20022.repository.entity.CardPaymentAcquiring.CardholderPresent, com.tools20022.repository.entity.CardPaymentAcquiring.OnLineContext, com.tools20022.repository.entity.CardPaymentAcquiring.AttendanceContext,
						com.tools20022.repository.entity.CardPaymentAcquiring.TransactionEnvironment, com.tools20022.repository.entity.CardPaymentAcquiring.TransactionChannel,
						com.tools20022.repository.entity.CardPaymentAcquiring.AttendantMessageCapable, com.tools20022.repository.entity.CardPaymentAcquiring.AttendantLanguage,
						com.tools20022.repository.entity.CardPaymentAcquiring.CardDataEntryMode, com.tools20022.repository.entity.CardPaymentAcquiring.FallbackIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger,
						com.tools20022.repository.entity.CardPaymentAcquiring.InitiatorTransactionIdentifier, com.tools20022.repository.entity.CardPaymentAcquiring.Reversal,
						com.tools20022.repository.entity.CardPaymentAcquiring.InterchangeData, com.tools20022.repository.entity.CardPaymentAcquiring.UnattendedLevelCategory, com.tools20022.repository.entity.CardPaymentAcquiring.Validation,
						com.tools20022.repository.entity.CardPaymentAcquiring.CompletionRequired, com.tools20022.repository.entity.CardPaymentAcquiring.ActionType, com.tools20022.repository.entity.CardPaymentAcquiring.ActionMessage,
						com.tools20022.repository.entity.CardPaymentAcquiring.CaptureIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.RecipientTransactionIdentification,
						com.tools20022.repository.entity.CardPaymentAcquiring.Location, com.tools20022.repository.entity.CardPaymentAcquiring.Country);
				derivationComponent_lazy = () -> Arrays.asList(TransactionIdentifier1.mmObject(), PaymentContext3.mmObject(), PaymentContext1.mmObject(), SaleContext1.mmObject(), CardPaymentContext3.mmObject(), PaymentContext4.mmObject(),
						CardPaymentContext4.mmObject(), ActionMessage1.mmObject(), Action1.mmObject(), Action2.mmObject(), CardPaymentContext1.mmObject(), PaymentContext2.mmObject(), CardPaymentContext2.mmObject(),
						PaymentContext7.mmObject(), CardPaymentContext7.mmObject(), PaymentContext6.mmObject(), CardPaymentContext6.mmObject(), CardPaymentContext5.mmObject(), PaymentContext5.mmObject(), Action3.mmObject(),
						PaymentContext10.mmObject(), CardPaymentContext8.mmObject(), PaymentContext8.mmObject(), CardPaymentContext11.mmObject(), PaymentContext11.mmObject(), CardPaymentContext13.mmObject(), PaymentContext13.mmObject(),
						CardPaymentContext9.mmObject(), PaymentContext9.mmObject(), CardPaymentContext12.mmObject(), ActionMessage2.mmObject(), CardPaymentContext10.mmObject(), PaymentContext12.mmObject(), Action4.mmObject(),
						Action5.mmObject(), ActionMessage4.mmObject(), ActionMessage3.mmObject(), CardTransactionContext3.mmObject(), TransactionIdentifier2.mmObject(), CardTransactionContext1.mmObject(), CardTransaction3.mmObject(),
						CardTransactionContext4.mmObject(), CardTransactionContext2.mmObject(), CardPaymentContext18.mmObject(), PaymentContext17.mmObject(), CardPaymentContext14.mmObject(), PaymentContext14.mmObject(),
						SaleContext2.mmObject(), CardPaymentContext17.mmObject(), CardPaymentContext19.mmObject(), PaymentContext18.mmObject(), ActionMessage5.mmObject(), CardPaymentContext16.mmObject(), Action6.mmObject(),
						PaymentContext19.mmObject(), PaymentContext16.mmObject(), PaymentContext15.mmObject(), CardPaymentContext15.mmObject(), Action7.mmObject(), PaymentContext22.mmObject(), CardPaymentContext25.mmObject(),
						CardPaymentContext24.mmObject(), PaymentContext24.mmObject(), CardPaymentContext20.mmObject(), PaymentContext20.mmObject(), Action8.mmObject(), PaymentContext25.mmObject(), CardPaymentContext21.mmObject(),
						PaymentContext21.mmObject(), CardPaymentContext22.mmObject(), CardPaymentContext23.mmObject(), PaymentContext23.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}