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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Payment processes initiated by a payment card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentAcquiring" src="doc-files/CardPaymentAcquiring.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedCardPayment
 * Country.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
 * CardPayment.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardPaymentAcquiring
 * PointOfInteraction.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmCardPaymentAcquiring
 * TerminalManagementSystem.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
 * CardPaymentValidation.mmCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext3#mmPaymentContext
 * CardPaymentContext3.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext3#mmSaleContext
 * CardPaymentContext3.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext4#mmPaymentContext
 * CardPaymentContext4.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext4#mmSaleContext
 * CardPaymentContext4.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1#mmPaymentContext
 * CardPaymentContext1.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1#mmSaleContext
 * CardPaymentContext1.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext2#mmPaymentContext
 * CardPaymentContext2.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext2#mmSaleContext
 * CardPaymentContext2.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext7#mmPaymentContext
 * CardPaymentContext7.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext7#mmSaleContext
 * CardPaymentContext7.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext6#mmPaymentContext
 * CardPaymentContext6.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext6#mmSaleContext
 * CardPaymentContext6.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext5#mmPaymentContext
 * CardPaymentContext5.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext5#mmSaleContext
 * CardPaymentContext5.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext8#mmPaymentContext
 * CardPaymentContext8.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext8#mmSaleContext
 * CardPaymentContext8.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext11#mmPaymentContext
 * CardPaymentContext11.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext11#mmSaleContext
 * CardPaymentContext11.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext13#mmPaymentContext
 * CardPaymentContext13.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext13#mmSaleContext
 * CardPaymentContext13.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext9#mmPaymentContext
 * CardPaymentContext9.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext9#mmSaleContext
 * CardPaymentContext9.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext12#mmPaymentContext
 * CardPaymentContext12.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext12#mmSaleContext
 * CardPaymentContext12.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10#mmPaymentContext
 * CardPaymentContext10.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10#mmSaleContext
 * CardPaymentContext10.mmSaleContext}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAction
 * AuthorisationResult8.mmAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext3#mmTransactionContext
 * CardTransactionContext3.mmTransactionContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1#mmTransactionContext
 * CardTransactionContext1.mmTransactionContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1#mmSaleContext
 * CardTransactionContext1.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmReconciliation
 * CardTransaction6.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext18#mmPaymentContext
 * CardPaymentContext18.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext18#mmSaleContext
 * CardPaymentContext18.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext14#mmPaymentContext
 * CardPaymentContext14.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext14#mmSaleContext
 * CardPaymentContext14.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext17#mmPaymentContext
 * CardPaymentContext17.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext17#mmSaleContext
 * CardPaymentContext17.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext19#mmPaymentContext
 * CardPaymentContext19.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext19#mmSaleContext
 * CardPaymentContext19.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext16#mmPaymentContext
 * CardPaymentContext16.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext16#mmSaleContext
 * CardPaymentContext16.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext15#mmPaymentContext
 * CardPaymentContext15.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext15#mmSaleContext
 * CardPaymentContext15.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext25#mmPaymentContext
 * CardPaymentContext25.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext25#mmSaleContext
 * CardPaymentContext25.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24#mmPaymentContext
 * CardPaymentContext24.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24#mmSaleContext
 * CardPaymentContext24.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext20#mmPaymentContext
 * CardPaymentContext20.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext20#mmSaleContext
 * CardPaymentContext20.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext21#mmPaymentContext
 * CardPaymentContext21.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext21#mmSaleContext
 * CardPaymentContext21.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext22#mmPaymentContext
 * CardPaymentContext22.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext22#mmSaleContext
 * CardPaymentContext22.mmSaleContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext23#mmPaymentContext
 * CardPaymentContext23.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext23#mmSaleContext
 * CardPaymentContext23.mmSaleContext}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
 * CardPaymentAcquiring.mmPointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
 * CardPaymentAcquiring.mmCardPaymentService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
 * CardPaymentAcquiring.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionDateTime
 * CardPaymentAcquiring.mmTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmICCRelatedData
 * CardPaymentAcquiring.mmICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPresent
 * CardPaymentAcquiring.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardholderPresent
 * CardPaymentAcquiring.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmOnLineContext
 * CardPaymentAcquiring.mmOnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendanceContext
 * CardPaymentAcquiring.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionEnvironment
 * CardPaymentAcquiring.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionChannel
 * CardPaymentAcquiring.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendantMessageCapable
 * CardPaymentAcquiring.mmAttendantMessageCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendantLanguage
 * CardPaymentAcquiring.mmAttendantLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardDataEntryMode
 * CardPaymentAcquiring.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmFallbackIndicator
 * CardPaymentAcquiring.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
 * CardPaymentAcquiring.mmTMSTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInitiatorTransactionIdentifier
 * CardPaymentAcquiring.mmInitiatorTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmReversal
 * CardPaymentAcquiring.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInterchangeData
 * CardPaymentAcquiring.mmInterchangeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmUnattendedLevelCategory
 * CardPaymentAcquiring.mmUnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
 * CardPaymentAcquiring.mmValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCompletionRequired
 * CardPaymentAcquiring.mmCompletionRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionType
 * CardPaymentAcquiring.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
 * CardPaymentAcquiring.mmActionMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCaptureIndicator
 * CardPaymentAcquiring.mmCaptureIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRecipientTransactionIdentification
 * CardPaymentAcquiring.mmRecipientTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmLocation
 * CardPaymentAcquiring.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCountry
 * CardPaymentAcquiring.mmCountry}</li>
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
 * "CardPaymentAcquiring"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment processes initiated by a payment card."</li>
 * </ul>
 */
public class CardPaymentAcquiring {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PointOfInteraction pointOfInteraction;
	/**
	 * Describes the Point of Interaction through which the payment by card was
	 * initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardPaymentAcquiring
	 * PointOfInteraction.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#mmPOI
	 * CardEntry1.mmPOI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction1#mmPOI
	 * CardTransaction1.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionData1#mmPointOfInteraction
	 * TransactionData1.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment8#mmPOIIdentification
	 * CardPaymentEnvironment8.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment17#mmPOIIdentification
	 * CardPaymentEnvironment17.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment5#mmPOI
	 * CardPaymentEnvironment5.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#mmPOI
	 * CardPaymentEnvironment6.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmPOIIdentification
	 * CardPaymentTransaction8.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13#mmPOI
	 * CardPaymentEnvironment13.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmPOI
	 * CardPaymentEnvironment14.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#mmPOIIdentification
	 * CardPaymentEnvironment3.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#mmPOIIdentification
	 * CardPaymentEnvironment11.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmPOIIdentification
	 * CardPaymentEnvironment16.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1#mmMessageDestination
	 * ActionMessage1.mmMessageDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#mmPOI
	 * CardPaymentEnvironment1.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#mmPOI
	 * CardPaymentEnvironment9.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7#mmPOIIdentification
	 * CardPaymentEnvironment7.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15#mmPOIIdentification
	 * CardPaymentEnvironment15.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#mmPOIIdentification
	 * CardPaymentEnvironment19.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment4#mmPOI
	 * CardPaymentEnvironment4.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#mmPOI
	 * CardPaymentEnvironment12.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#mmPOI
	 * CardPaymentEnvironment2.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmPOI
	 * CardPaymentEnvironment10.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#mmPOI
	 * CardPaymentEnvironment18.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmPOIIdentification
	 * CardPaymentEnvironment31.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29#mmPOIIdentification
	 * CardPaymentEnvironment29.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#mmPOI
	 * CardPaymentEnvironment24.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25#mmPOIIdentification
	 * CardPaymentEnvironment25.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#mmPOI
	 * CardPaymentEnvironment20.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#mmPOI
	 * CardPaymentEnvironment30.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmPOI
	 * CardPaymentEnvironment27.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmPOIIdentification
	 * CardPaymentEnvironment28.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#mmPOIIdentification
	 * CardPaymentEnvironment21.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26#mmPOI
	 * CardPaymentEnvironment26.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#mmPOI
	 * CardPaymentEnvironment23.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmPOI
	 * CardPaymentEnvironment22.mmPOI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction2#mmPOI
	 * CardTransaction2.mmPOI}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmPOI
	 * CardEntry2.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmPOIIdentification
	 * CardPaymentEnvironment37.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33#mmPOIIdentification
	 * CardPaymentEnvironment33.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#mmPOI
	 * CardPaymentEnvironment32.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#mmPOI
	 * CardPaymentEnvironment36.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmPOIIdentification
	 * CardPaymentEnvironment43.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41#mmPOIIdentification
	 * CardPaymentEnvironment41.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42#mmPOIIdentification
	 * CardPaymentEnvironment42.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmPOI
	 * CardPaymentEnvironment40.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageDestination
	 * ActionMessage2.mmMessageDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#mmPOI
	 * CardPaymentEnvironment44.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmPOI
	 * CardPaymentEnvironment34.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#mmPOI
	 * CardPaymentEnvironment35.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmPOIIdentification
	 * CardPaymentEnvironment38.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39#mmPOI
	 * CardPaymentEnvironment39.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage3#mmDestination
	 * ActionMessage3.mmDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46#mmPOIIdentification
	 * CardPaymentEnvironment46.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmPOIIdentification
	 * CardPaymentEnvironment50.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#mmPOI
	 * CardPaymentEnvironment52.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#mmPOI
	 * CardPaymentEnvironment49.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51#mmPOI
	 * CardPaymentEnvironment51.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#mmPOI
	 * CardPaymentEnvironment48.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#mmPOI
	 * CardPaymentEnvironment56.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#mmPOI
	 * CardPaymentEnvironment45.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmPOIIdentification
	 * CardPaymentEnvironment55.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmPOIIdentification
	 * CardPaymentEnvironment54.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmPOI
	 * CardPaymentEnvironment53.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmPOI
	 * CardPaymentEnvironment47.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmPOI
	 * CardPaymentEnvironment61.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmPOIIdentification
	 * CardPaymentEnvironment64.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmPOI
	 * CardPaymentEnvironment60.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#mmPOIIdentification
	 * CardPaymentEnvironment65.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmPOIIdentification
	 * CardPaymentEnvironment67.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmPOIIdentification
	 * CardPaymentEnvironment66.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmPOI
	 * CardPaymentEnvironment62.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#mmPOI
	 * CardPaymentEnvironment63.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#mmPOI
	 * CardPaymentEnvironment58.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmPOI
	 * CardPaymentEnvironment59.mmPOI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmPOI
	 * CardPaymentEnvironment57.mmPOI}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmPointOfInteraction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardEntry1.mmPOI, CardTransaction1.mmPOI, TransactionData1.mmPointOfInteraction, CardPaymentEnvironment8.mmPOIIdentification, CardPaymentEnvironment17.mmPOIIdentification,
					CardPaymentEnvironment5.mmPOI, CardPaymentEnvironment6.mmPOI, CardPaymentTransaction8.mmPOIIdentification, CardPaymentEnvironment13.mmPOI, CardPaymentEnvironment14.mmPOI, CardPaymentEnvironment3.mmPOIIdentification,
					CardPaymentEnvironment11.mmPOIIdentification, CardPaymentEnvironment16.mmPOIIdentification, ActionMessage1.mmMessageDestination, CardPaymentEnvironment1.mmPOI, CardPaymentEnvironment9.mmPOI,
					CardPaymentEnvironment7.mmPOIIdentification, CardPaymentEnvironment15.mmPOIIdentification, CardPaymentEnvironment19.mmPOIIdentification, CardPaymentEnvironment4.mmPOI, CardPaymentEnvironment12.mmPOI,
					CardPaymentEnvironment2.mmPOI, CardPaymentEnvironment10.mmPOI, CardPaymentEnvironment18.mmPOI, CardPaymentEnvironment31.mmPOIIdentification, CardPaymentEnvironment29.mmPOIIdentification, CardPaymentEnvironment24.mmPOI,
					CardPaymentEnvironment25.mmPOIIdentification, CardPaymentEnvironment20.mmPOI, CardPaymentEnvironment30.mmPOI, CardPaymentEnvironment27.mmPOI, CardPaymentEnvironment28.mmPOIIdentification,
					CardPaymentEnvironment21.mmPOIIdentification, CardPaymentEnvironment26.mmPOI, CardPaymentEnvironment23.mmPOI, CardPaymentEnvironment22.mmPOI, CardTransaction2.mmPOI, CardEntry2.mmPOI,
					CardPaymentEnvironment37.mmPOIIdentification, CardPaymentEnvironment33.mmPOIIdentification, CardPaymentEnvironment32.mmPOI, CardPaymentEnvironment36.mmPOI, CardPaymentEnvironment43.mmPOIIdentification,
					CardPaymentEnvironment41.mmPOIIdentification, CardPaymentEnvironment42.mmPOIIdentification, CardPaymentEnvironment40.mmPOI, ActionMessage2.mmMessageDestination, CardPaymentEnvironment44.mmPOI,
					CardPaymentEnvironment34.mmPOI, CardPaymentEnvironment35.mmPOI, CardPaymentEnvironment38.mmPOIIdentification, CardPaymentEnvironment39.mmPOI, ActionMessage3.mmDestination, CardPaymentEnvironment46.mmPOIIdentification,
					CardPaymentEnvironment50.mmPOIIdentification, CardPaymentEnvironment52.mmPOI, CardPaymentEnvironment49.mmPOI, CardPaymentEnvironment51.mmPOI, CardPaymentEnvironment48.mmPOI, CardPaymentEnvironment56.mmPOI,
					CardPaymentEnvironment45.mmPOI, CardPaymentEnvironment55.mmPOIIdentification, CardPaymentEnvironment54.mmPOIIdentification, CardPaymentEnvironment53.mmPOI, CardPaymentEnvironment47.mmPOI, CardPaymentEnvironment61.mmPOI,
					CardPaymentEnvironment64.mmPOIIdentification, CardPaymentEnvironment60.mmPOI, CardPaymentEnvironment65.mmPOIIdentification, CardPaymentEnvironment67.mmPOIIdentification, CardPaymentEnvironment66.mmPOIIdentification,
					CardPaymentEnvironment62.mmPOI, CardPaymentEnvironment63.mmPOI, CardPaymentEnvironment58.mmPOI, CardPaymentEnvironment59.mmPOI, CardPaymentEnvironment57.mmPOI);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PointOfInteraction";
			definition = "Describes the Point of Interaction through which the payment by card was initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmCardPaymentAcquiring;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
		}
	};
	protected CardPaymentServiceTypeCode cardPaymentService;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmAdditionalService
	 * CardAggregated1.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmAdditionalService
	 * CardIndividualTransaction1.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#mmTransactionType
	 * CommonData1.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#mmAdditionalService
	 * CommonData1.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#mmServiceAttribute
	 * CommonData1.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmTransactionType
	 * CardPaymentTransaction8.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmAdditionalService
	 * CardPaymentTransaction8.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmServiceAttribute
	 * CardPaymentTransaction8.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmTransactionType
	 * CardPaymentTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmAdditionalService
	 * CardPaymentTransaction4.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmServiceAttribute
	 * CardPaymentTransaction4.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#mmTransactionType
	 * CommonData2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#mmAdditionalService
	 * CommonData2.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#mmServiceAttribute
	 * CommonData2.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmTransactionType
	 * CardPaymentTransaction17.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmAdditionalService
	 * CardPaymentTransaction17.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmServiceAttribute
	 * CardPaymentTransaction17.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmTransactionType
	 * CardPaymentTransaction14.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmAdditionalService
	 * CardPaymentTransaction14.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmServiceAttribute
	 * CardPaymentTransaction14.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmTransactionType
	 * CardPaymentTransaction1.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmAdditionalService
	 * CardPaymentTransaction1.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmServiceAttribute
	 * CardPaymentTransaction1.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmTransactionType
	 * CardPaymentTransaction11.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmAdditionalService
	 * CardPaymentTransaction11.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmServiceAttribute
	 * CardPaymentTransaction11.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmTransactionType
	 * CardPaymentTransaction19.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmAdditionalService
	 * CardPaymentTransaction19.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmServiceAttribute
	 * CardPaymentTransaction19.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionType
	 * CardPaymentTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmAdditionalService
	 * CardPaymentTransaction3.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmServiceAttribute
	 * CardPaymentTransaction3.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmTransactionType
	 * CardPaymentTransaction13.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmAdditionalService
	 * CardPaymentTransaction13.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmServiceAttribute
	 * CardPaymentTransaction13.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#mmTransactionType
	 * CardPaymentTransaction21.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#mmAdditionalService
	 * CardPaymentTransaction21.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#mmServiceAttribute
	 * CardPaymentTransaction21.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmTransactionType
	 * CardPaymentTransaction22.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmAdditionalService
	 * CardPaymentTransaction22.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmServiceAttribute
	 * CardPaymentTransaction22.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmTransactionType
	 * CardPaymentTransaction34.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmAdditionalService
	 * CardPaymentTransaction34.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmServiceAttribute
	 * CardPaymentTransaction34.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmTransactionType
	 * CardPaymentTransaction31.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmAdditionalService
	 * CardPaymentTransaction31.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmServiceAttribute
	 * CardPaymentTransaction31.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#mmTransactionType
	 * CommonData3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#mmAdditionalService
	 * CommonData3.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#mmServiceAttribute
	 * CommonData3.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionType
	 * CardPaymentTransaction29.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmAdditionalService
	 * CardPaymentTransaction29.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmServiceAttribute
	 * CardPaymentTransaction29.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmTransactionType
	 * CardPaymentTransaction25.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmAdditionalService
	 * CardPaymentTransaction25.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmServiceAttribute
	 * CardPaymentTransaction25.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmAdditionalService
	 * CardIndividualTransaction2.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmTransactionType
	 * CardPaymentTransaction36.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmAdditionalService
	 * CardPaymentTransaction36.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmServiceAttribute
	 * CardPaymentTransaction36.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionType
	 * CardPaymentTransaction45.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmAdditionalService
	 * CardPaymentTransaction45.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmServiceAttribute
	 * CardPaymentTransaction45.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#mmTransactionType
	 * CardPaymentTransaction37.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#mmAdditionalService
	 * CardPaymentTransaction37.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#mmServiceAttribute
	 * CardPaymentTransaction37.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmTransactionType
	 * CardPaymentTransaction49.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmAdditionalService
	 * CardPaymentTransaction49.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmServiceAttribute
	 * CardPaymentTransaction49.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmTransactionType
	 * CardPaymentTransaction47.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmAdditionalService
	 * CardPaymentTransaction47.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmServiceAttribute
	 * CardPaymentTransaction47.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#mmTransactionType
	 * CommonData4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#mmAdditionalService
	 * CommonData4.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#mmServiceAttribute
	 * CommonData4.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmTransactionType
	 * CardPaymentTransaction40.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmAdditionalService
	 * CardPaymentTransaction40.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmServiceAttribute
	 * CardPaymentTransaction40.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionType
	 * CardTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionType
	 * CardTransaction8.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmTransactionType
	 * CardTransaction5.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAdditionalService
	 * CardTransaction5.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmServiceAttribute
	 * CardTransaction5.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionType
	 * CardTransaction15.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAdditionalService
	 * CardTransaction15.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmServiceAttribute
	 * CardTransaction15.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionType
	 * CardTransaction7.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionType
	 * CardTransaction6.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmTransactionType
	 * CardPaymentTransaction52.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmAdditionalService
	 * CardPaymentTransaction52.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmServiceAttribute
	 * CardPaymentTransaction52.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionType
	 * CardPaymentTransaction60.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmAdditionalService
	 * CardPaymentTransaction60.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmServiceAttribute
	 * CardPaymentTransaction60.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmTransactionType
	 * CardPaymentTransaction64.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmAdditionalService
	 * CardPaymentTransaction64.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmServiceAttribute
	 * CardPaymentTransaction64.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionType
	 * CardPaymentTransaction51.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmAdditionalService
	 * CardPaymentTransaction51.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmServiceAttribute
	 * CardPaymentTransaction51.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#mmTransactionType
	 * CommonData5.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#mmAdditionalService
	 * CommonData5.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#mmServiceAttribute
	 * CommonData5.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmTransactionType
	 * CardPaymentTransaction55.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmAdditionalService
	 * CardPaymentTransaction55.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmServiceAttribute
	 * CardPaymentTransaction55.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmTransactionType
	 * CardPaymentTransaction62.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmAdditionalService
	 * CardPaymentTransaction62.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmServiceAttribute
	 * CardPaymentTransaction62.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmTransactionType
	 * CardPaymentTransaction71.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmAdditionalService
	 * CardPaymentTransaction71.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmServiceAttribute
	 * CardPaymentTransaction71.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionType
	 * CardPaymentTransaction70.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmAdditionalService
	 * CardPaymentTransaction70.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmServiceAttribute
	 * CardPaymentTransaction70.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmTransactionType
	 * CardPaymentTransaction72.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmAdditionalService
	 * CardPaymentTransaction72.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmServiceAttribute
	 * CardPaymentTransaction72.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionType
	 * CardPaymentTransaction76.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmAdditionalService
	 * CardPaymentTransaction76.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmServiceAttribute
	 * CardPaymentTransaction76.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmTransactionType
	 * CommonData6.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmAdditionalService
	 * CommonData6.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmServiceAttribute
	 * CommonData6.mmServiceAttribute}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionType
	 * CardPaymentTransaction69.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmAdditionalService
	 * CardPaymentTransaction69.mmAdditionalService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmServiceAttribute
	 * CardPaymentTransaction69.mmServiceAttribute}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardPaymentService = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardAggregated1.mmAdditionalService, CardIndividualTransaction1.mmAdditionalService, CommonData1.mmTransactionType, CommonData1.mmAdditionalService, CommonData1.mmServiceAttribute,
					CardPaymentTransaction8.mmTransactionType, CardPaymentTransaction8.mmAdditionalService, CardPaymentTransaction8.mmServiceAttribute, CardPaymentTransaction4.mmTransactionType, CardPaymentTransaction4.mmAdditionalService,
					CardPaymentTransaction4.mmServiceAttribute, CommonData2.mmTransactionType, CommonData2.mmAdditionalService, CommonData2.mmServiceAttribute, CardPaymentTransaction17.mmTransactionType,
					CardPaymentTransaction17.mmAdditionalService, CardPaymentTransaction17.mmServiceAttribute, CardPaymentTransaction14.mmTransactionType, CardPaymentTransaction14.mmAdditionalService,
					CardPaymentTransaction14.mmServiceAttribute, CardPaymentTransaction1.mmTransactionType, CardPaymentTransaction1.mmAdditionalService, CardPaymentTransaction1.mmServiceAttribute,
					CardPaymentTransaction11.mmTransactionType, CardPaymentTransaction11.mmAdditionalService, CardPaymentTransaction11.mmServiceAttribute, CardPaymentTransaction19.mmTransactionType,
					CardPaymentTransaction19.mmAdditionalService, CardPaymentTransaction19.mmServiceAttribute, CardPaymentTransaction3.mmTransactionType, CardPaymentTransaction3.mmAdditionalService,
					CardPaymentTransaction3.mmServiceAttribute, CardPaymentTransaction13.mmTransactionType, CardPaymentTransaction13.mmAdditionalService, CardPaymentTransaction13.mmServiceAttribute,
					CardPaymentTransaction21.mmTransactionType, CardPaymentTransaction21.mmAdditionalService, CardPaymentTransaction21.mmServiceAttribute, CardPaymentTransaction22.mmTransactionType,
					CardPaymentTransaction22.mmAdditionalService, CardPaymentTransaction22.mmServiceAttribute, CardPaymentTransaction34.mmTransactionType, CardPaymentTransaction34.mmAdditionalService,
					CardPaymentTransaction34.mmServiceAttribute, CardPaymentTransaction31.mmTransactionType, CardPaymentTransaction31.mmAdditionalService, CardPaymentTransaction31.mmServiceAttribute, CommonData3.mmTransactionType,
					CommonData3.mmAdditionalService, CommonData3.mmServiceAttribute, CardPaymentTransaction29.mmTransactionType, CardPaymentTransaction29.mmAdditionalService, CardPaymentTransaction29.mmServiceAttribute,
					CardPaymentTransaction25.mmTransactionType, CardPaymentTransaction25.mmAdditionalService, CardPaymentTransaction25.mmServiceAttribute, CardIndividualTransaction2.mmAdditionalService,
					CardPaymentTransaction36.mmTransactionType, CardPaymentTransaction36.mmAdditionalService, CardPaymentTransaction36.mmServiceAttribute, CardPaymentTransaction45.mmTransactionType,
					CardPaymentTransaction45.mmAdditionalService, CardPaymentTransaction45.mmServiceAttribute, CardPaymentTransaction37.mmTransactionType, CardPaymentTransaction37.mmAdditionalService,
					CardPaymentTransaction37.mmServiceAttribute, CardPaymentTransaction49.mmTransactionType, CardPaymentTransaction49.mmAdditionalService, CardPaymentTransaction49.mmServiceAttribute,
					CardPaymentTransaction47.mmTransactionType, CardPaymentTransaction47.mmAdditionalService, CardPaymentTransaction47.mmServiceAttribute, CommonData4.mmTransactionType, CommonData4.mmAdditionalService,
					CommonData4.mmServiceAttribute, CardPaymentTransaction40.mmTransactionType, CardPaymentTransaction40.mmAdditionalService, CardPaymentTransaction40.mmServiceAttribute, CardTransaction4.mmTransactionType,
					CardTransaction8.mmTransactionType, CardTransaction5.mmTransactionType, CardTransaction5.mmAdditionalService, CardTransaction5.mmServiceAttribute, CardTransaction15.mmTransactionType,
					CardTransaction15.mmAdditionalService, CardTransaction15.mmServiceAttribute, CardTransaction7.mmTransactionType, CardTransaction6.mmTransactionType, CardPaymentTransaction52.mmTransactionType,
					CardPaymentTransaction52.mmAdditionalService, CardPaymentTransaction52.mmServiceAttribute, CardPaymentTransaction60.mmTransactionType, CardPaymentTransaction60.mmAdditionalService,
					CardPaymentTransaction60.mmServiceAttribute, CardPaymentTransaction64.mmTransactionType, CardPaymentTransaction64.mmAdditionalService, CardPaymentTransaction64.mmServiceAttribute,
					CardPaymentTransaction51.mmTransactionType, CardPaymentTransaction51.mmAdditionalService, CardPaymentTransaction51.mmServiceAttribute, CommonData5.mmTransactionType, CommonData5.mmAdditionalService,
					CommonData5.mmServiceAttribute, CardPaymentTransaction55.mmTransactionType, CardPaymentTransaction55.mmAdditionalService, CardPaymentTransaction55.mmServiceAttribute, CardPaymentTransaction62.mmTransactionType,
					CardPaymentTransaction62.mmAdditionalService, CardPaymentTransaction62.mmServiceAttribute, CardPaymentTransaction71.mmTransactionType, CardPaymentTransaction71.mmAdditionalService,
					CardPaymentTransaction71.mmServiceAttribute, CardPaymentTransaction70.mmTransactionType, CardPaymentTransaction70.mmAdditionalService, CardPaymentTransaction70.mmServiceAttribute,
					CardPaymentTransaction72.mmTransactionType, CardPaymentTransaction72.mmAdditionalService, CardPaymentTransaction72.mmServiceAttribute, CardPaymentTransaction76.mmTransactionType,
					CardPaymentTransaction76.mmAdditionalService, CardPaymentTransaction76.mmServiceAttribute, CommonData6.mmTransactionType, CommonData6.mmAdditionalService, CommonData6.mmServiceAttribute,
					CardPaymentTransaction69.mmTransactionType, CardPaymentTransaction69.mmAdditionalService, CardPaymentTransaction69.mmServiceAttribute);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPaymentService";
			definition = "Type of service provided by the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceTypeCode.mmObject();
		}
	};
	protected Max35Text transactionIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#mmTransactionReference
	 * TransactionIdentifier1.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmTransactionIdentification
	 * CardIndividualTransaction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#mmTransactionReference
	 * CardPaymentTransactionDetails8.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmTransactionIdentification
	 * CardPaymentTransaction8.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmTransactionIdentification
	 * CardPaymentTransaction4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmTransactionIdentification
	 * CardPaymentTransaction17.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmTransactionIdentification
	 * CardPaymentTransaction14.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmTransactionIdentification
	 * CardPaymentTransaction7.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmTransactionIdentification
	 * CardPaymentTransaction16.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmTransactionIdentification
	 * CardPaymentTransaction20.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmTransactionIdentification
	 * CardPaymentTransaction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmTransactionIdentification
	 * CardPaymentTransaction11.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmTransactionIdentification
	 * CardPaymentTransaction19.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#mmTransactionIdentification
	 * CardPaymentTransaction2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#mmTransactionIdentification
	 * CardPaymentTransaction12.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#mmTransactionIdentification
	 * CardPaymentTransaction5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmTransactionIdentification
	 * CardPaymentTransaction15.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#mmTransactionIdentification
	 * CardPaymentTransaction6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionIdentification
	 * CardPaymentTransaction3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmTransactionIdentification
	 * CardPaymentTransaction13.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction13.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmTransactionIdentification
	 * CardPaymentTransaction28.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#mmTransactionIdentification
	 * CardPaymentTransaction21.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmTransactionIdentification
	 * CardPaymentTransaction22.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmTransactionIdentification
	 * CardPaymentTransaction34.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#mmTransactionIdentification
	 * CardPaymentTransaction32.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmTransactionIdentification
	 * CardPaymentTransaction31.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#mmTransactionIdentification
	 * CardPaymentTransaction35.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction33#mmTransactionIdentification
	 * CardPaymentTransaction33.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#mmTransactionIdentification
	 * CardPaymentTransaction23.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionIdentification
	 * CardPaymentTransaction29.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmTransactionIdentification
	 * CardPaymentTransaction25.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction25.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmTransactionIdentification
	 * CardPaymentTransaction30.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmTransactionIdentification
	 * CardPaymentTransaction26.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionIdentification
	 * CardIndividualTransaction2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#mmTransactionIdentification
	 * CardPaymentTransaction38.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#mmTransactionIdentification
	 * CardPaymentTransaction48.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction50#mmTransactionIdentification
	 * CardPaymentTransaction50.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#mmTransactionIdentification
	 * CardPaymentTransaction42.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmTransactionIdentification
	 * CardPaymentTransaction36.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmTransactionIdentification
	 * CardPaymentTransaction44.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionIdentification
	 * CardPaymentTransaction45.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#mmTransactionIdentification
	 * CardPaymentTransaction37.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmTransactionIdentification
	 * CardPaymentTransaction49.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmTransactionIdentification
	 * CardPaymentTransaction47.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#mmTransactionIdentification
	 * CardPaymentTransaction41.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmTransactionIdentification
	 * CardPaymentTransaction46.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmTransactionIdentification
	 * CardPaymentTransaction40.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction40.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmTransactionIdentification
	 * ATMTransaction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmInitiatorTransactionIdentification
	 * CardTransaction4.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmInitiatorTransactionIdentification
	 * CardTransaction8.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionLifeCycleIdentification
	 * CardTransaction8.mmTransactionLifeCycleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionIdentification
	 * CardTransaction5.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmInitiatorTransactionIdentification
	 * CardTransaction5.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmInitiatorTransactionIdentification
	 * CardTransaction3.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmInitiatorIdentification
	 * CardTransaction3.mmInitiatorIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionIdentification
	 * CardTransaction15.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmInitiatorTransactionIdentification
	 * CardTransaction15.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmAcceptorTransactionIdentification
	 * CardTransaction7.mmAcceptorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmInitiatorTransactionIdentification
	 * CardTransaction7.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmTransactionIdentification
	 * CardPaymentTransaction52.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#mmTransactionIdentification
	 * CardPaymentTransaction63.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionIdentification
	 * CardPaymentTransaction60.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmTransactionIdentification
	 * CardPaymentTransaction57.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmTransactionIdentification
	 * CardPaymentTransaction61.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmTransactionIdentification
	 * CardPaymentTransaction64.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction65#mmTransactionIdentification
	 * CardPaymentTransaction65.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#mmTransactionIdentification
	 * CardPaymentTransaction53.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmTransactionIdentification
	 * CardPaymentTransaction59.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#mmTransactionIdentification
	 * CardPaymentTransaction56.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmTransactionIdentification
	 * CardPaymentTransaction51.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmTransactionIdentification
	 * CardPaymentTransaction55.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction55.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmTransactionIdentification
	 * CardPaymentTransaction62.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmTransactionIdentification
	 * ATMTransaction13.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmTransactionIdentification
	 * ATMTransaction16.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTransactionIdentification
	 * ATMTransaction19.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmTransactionIdentification
	 * ATMTransaction15.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTransactionIdentification
	 * ATMTransaction24.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTransactionIdentification
	 * ATMTransaction23.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmTransactionIdentification
	 * CardPaymentTransaction71.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmTransactionIdentification
	 * CardPaymentTransaction75.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmTransactionIdentification
	 * CardPaymentTransaction74.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionIdentification
	 * CardPaymentTransaction70.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmTransactionIdentification
	 * CardPaymentTransaction73.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmTransactionIdentification
	 * CardPaymentTransaction72.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmTransactionIdentification
	 * CardPaymentTransaction76.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionIdentification
	 * CardPaymentTransaction69.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction69.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmTransactionIdentification
	 * CardPaymentTransaction77.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmTransactionIdentification
	 * CardPaymentTransaction78.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionIdentifier1.mmTransactionReference, CardIndividualTransaction1.mmTransactionIdentification, CardPaymentTransactionDetails8.mmTransactionReference,
					CardPaymentTransaction8.mmTransactionIdentification, CardPaymentTransaction4.mmTransactionIdentification, CardPaymentTransaction17.mmTransactionIdentification, CardPaymentTransaction14.mmTransactionIdentification,
					CardPaymentTransaction7.mmTransactionIdentification, CardPaymentTransaction16.mmTransactionIdentification, CardPaymentTransaction20.mmTransactionIdentification, CardPaymentTransaction1.mmTransactionIdentification,
					CardPaymentTransaction11.mmTransactionIdentification, CardPaymentTransaction19.mmTransactionIdentification, CardPaymentTransaction2.mmTransactionIdentification, CardPaymentTransaction12.mmTransactionIdentification,
					CardPaymentTransaction5.mmTransactionIdentification, CardPaymentTransaction15.mmTransactionIdentification, CardPaymentTransaction6.mmTransactionIdentification, CardPaymentTransaction3.mmTransactionIdentification,
					CardPaymentTransaction13.mmTransactionIdentification, CardPaymentTransaction13.mmInitiatorTransactionIdentification, CardPaymentTransaction28.mmTransactionIdentification,
					CardPaymentTransaction21.mmTransactionIdentification, CardPaymentTransaction22.mmTransactionIdentification, CardPaymentTransaction34.mmTransactionIdentification, CardPaymentTransaction32.mmTransactionIdentification,
					CardPaymentTransaction31.mmTransactionIdentification, CardPaymentTransaction35.mmTransactionIdentification, CardPaymentTransaction33.mmTransactionIdentification, CardPaymentTransaction23.mmTransactionIdentification,
					CardPaymentTransaction29.mmTransactionIdentification, CardPaymentTransaction25.mmTransactionIdentification, CardPaymentTransaction25.mmInitiatorTransactionIdentification,
					CardPaymentTransaction30.mmTransactionIdentification, CardPaymentTransaction26.mmTransactionIdentification, CardIndividualTransaction2.mmTransactionIdentification, CardPaymentTransaction38.mmTransactionIdentification,
					CardPaymentTransaction48.mmTransactionIdentification, CardPaymentTransaction50.mmTransactionIdentification, CardPaymentTransaction42.mmTransactionIdentification, CardPaymentTransaction36.mmTransactionIdentification,
					CardPaymentTransaction44.mmTransactionIdentification, CardPaymentTransaction45.mmTransactionIdentification, CardPaymentTransaction37.mmTransactionIdentification, CardPaymentTransaction49.mmTransactionIdentification,
					CardPaymentTransaction47.mmTransactionIdentification, CardPaymentTransaction41.mmTransactionIdentification, CardPaymentTransaction46.mmTransactionIdentification, CardPaymentTransaction40.mmTransactionIdentification,
					CardPaymentTransaction40.mmInitiatorTransactionIdentification, ATMTransaction1.mmTransactionIdentification, CardTransaction4.mmInitiatorTransactionIdentification, CardTransaction8.mmInitiatorTransactionIdentification,
					CardTransaction8.mmTransactionLifeCycleIdentification, CardTransaction5.mmAcceptorTransactionIdentification, CardTransaction5.mmInitiatorTransactionIdentification, CardTransaction3.mmInitiatorTransactionIdentification,
					CardTransaction3.mmInitiatorIdentification, CardTransaction15.mmAcceptorTransactionIdentification, CardTransaction15.mmInitiatorTransactionIdentification, CardTransaction7.mmAcceptorTransactionIdentification,
					CardTransaction7.mmInitiatorTransactionIdentification, CardPaymentTransaction52.mmTransactionIdentification, CardPaymentTransaction63.mmTransactionIdentification, CardPaymentTransaction60.mmTransactionIdentification,
					CardPaymentTransaction57.mmTransactionIdentification, CardPaymentTransaction61.mmTransactionIdentification, CardPaymentTransaction64.mmTransactionIdentification, CardPaymentTransaction65.mmTransactionIdentification,
					CardPaymentTransaction53.mmTransactionIdentification, CardPaymentTransaction59.mmTransactionIdentification, CardPaymentTransaction56.mmTransactionIdentification, CardPaymentTransaction51.mmTransactionIdentification,
					CardPaymentTransaction55.mmTransactionIdentification, CardPaymentTransaction55.mmInitiatorTransactionIdentification, CardPaymentTransaction62.mmTransactionIdentification, ATMTransaction13.mmTransactionIdentification,
					ATMTransaction16.mmTransactionIdentification, ATMTransaction19.mmTransactionIdentification, ATMTransaction15.mmTransactionIdentification, ATMTransaction24.mmTransactionIdentification,
					ATMTransaction23.mmTransactionIdentification, CardPaymentTransaction71.mmTransactionIdentification, CardPaymentTransaction75.mmTransactionIdentification, CardPaymentTransaction74.mmTransactionIdentification,
					CardPaymentTransaction70.mmTransactionIdentification, CardPaymentTransaction73.mmTransactionIdentification, CardPaymentTransaction72.mmTransactionIdentification, CardPaymentTransaction76.mmTransactionIdentification,
					CardPaymentTransaction69.mmTransactionIdentification, CardPaymentTransaction69.mmInitiatorTransactionIdentification, CardPaymentTransaction77.mmTransactionIdentification,
					CardPaymentTransaction78.mmTransactionIdentification);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime transactionDateTime;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifier1#mmTransactionDateTime
	 * TransactionIdentifier1.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#mmTransactionDateTime
	 * CardPaymentTransactionDetails8.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAcceptorTransactionDateTime
	 * CardTransaction4.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmAcceptorTransactionDateTime
	 * CardTransaction8.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAcceptorTransactionDateTime
	 * CardTransaction5.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction3#mmAcceptorTransactionDateTime
	 * CardTransaction3.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionDateTime
	 * CardTransaction15.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmAcceptorTransactionDateTime
	 * CardTransaction7.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmAcceptorTransactionDateTime
	 * CardTransaction6.mmAcceptorTransactionDateTime}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransactionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionIdentifier1.mmTransactionDateTime, CardPaymentTransactionDetails8.mmTransactionDateTime, CardTransaction4.mmAcceptorTransactionDateTime,
					CardTransaction8.mmAcceptorTransactionDateTime, CardTransaction5.mmAcceptorTransactionDateTime, CardTransaction3.mmAcceptorTransactionDateTime, CardTransaction15.mmAcceptorTransactionDateTime,
					CardTransaction7.mmAcceptorTransactionDateTime, CardTransaction6.mmAcceptorTransactionDateTime);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionDateTime";
			definition = "Local date and time of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max10000Binary iCCRelatedData;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#mmICCRelatedData
	 * CardPaymentTransactionDetails8.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmICCRelatedData
	 * CardPaymentTransactionDetails4.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#mmICCRelatedData
	 * CardPaymentTransactionDetails7.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#mmICCRelatedData
	 * CardPaymentTransactionDetails9.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmICCRelatedData
	 * CardPaymentTransactionDetails1.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmICCRelatedData
	 * CardPaymentTransactionDetails10.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmICCRelatedData
	 * CardPaymentTransactionDetails2.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#mmICCRelatedData
	 * CardPaymentTransactionDetails11.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#mmICCRelatedData
	 * CardPaymentTransactionDetails5.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmICCRelatedData
	 * CardPaymentTransactionDetails3.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount6#mmICCRelatedData
	 * DetailedAmount6.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmICCRelatedData
	 * CardPaymentTransactionDetails12.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmICCRelatedData
	 * CardPaymentTransactionDetails13.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmICCRelatedData
	 * CardPaymentTransactionDetails18.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmICCRelatedData
	 * CardPaymentTransactionDetails16.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmICCRelatedData
	 * CardPaymentTransactionDetails14.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmICCRelatedData
	 * CardPaymentTransactionDetails15.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#mmICCRelatedData
	 * CardPaymentTransactionDetails17.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmICCRelatedData
	 * CardIndividualTransaction2.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmICCRelatedData
	 * CardPaymentTransactionDetails20.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#mmICCRelatedData
	 * CardPaymentTransactionDetails25.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmICCRelatedData
	 * CardPaymentTransactionDetails23.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmICCRelatedData
	 * CardPaymentTransactionDetails21.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#mmICCRelatedData
	 * CardPaymentTransactionDetails26.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmICCRelatedData
	 * CardPaymentTransactionDetails19.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmICCRelatedData
	 * CardPaymentTransactionDetails24.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmICCRelatedData
	 * CardPaymentTransactionDetails32.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#mmICCRelatedData
	 * CardPaymentTransactionDetails33.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmICCRelatedData
	 * CardPaymentTransactionDetails28.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmICCRelatedData
	 * CardPaymentTransactionDetails29.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmICCRelatedData
	 * CardPaymentTransactionDetails30.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmICCRelatedData
	 * CardPaymentTransactionDetails27.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmICCRelatedData
	 * CardPaymentTransactionDetails31.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount14#mmICCRelatedData
	 * DetailedAmount14.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#mmICCRelatedData
	 * CardPaymentTransactionDetails34.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmICCRelatedData
	 * CardPaymentTransactionDetails39.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmICCRelatedData
	 * CardPaymentTransactionDetails38.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmICCRelatedData
	 * CardPaymentTransactionDetails41.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmICCRelatedData
	 * CardPaymentTransactionDetails37.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmICCRelatedData
	 * CardPaymentTransactionDetails40.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#mmICCRelatedData
	 * CardPaymentTransactionDetails42.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#mmICCRelatedData
	 * CardPaymentTransactionDetails43.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmICCRelatedData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails8.mmICCRelatedData, CardPaymentTransactionDetails4.mmICCRelatedData, CardPaymentTransactionDetails7.mmICCRelatedData,
					CardPaymentTransactionDetails9.mmICCRelatedData, CardPaymentTransactionDetails1.mmICCRelatedData, CardPaymentTransactionDetails10.mmICCRelatedData, CardPaymentTransactionDetails2.mmICCRelatedData,
					CardPaymentTransactionDetails11.mmICCRelatedData, CardPaymentTransactionDetails5.mmICCRelatedData, CardPaymentTransactionDetails3.mmICCRelatedData, DetailedAmount6.mmICCRelatedData,
					CardPaymentTransactionDetails12.mmICCRelatedData, CardPaymentTransactionDetails13.mmICCRelatedData, CardPaymentTransactionDetails18.mmICCRelatedData, CardPaymentTransactionDetails16.mmICCRelatedData,
					CardPaymentTransactionDetails14.mmICCRelatedData, CardPaymentTransactionDetails15.mmICCRelatedData, CardPaymentTransactionDetails17.mmICCRelatedData, CardIndividualTransaction2.mmICCRelatedData,
					CardPaymentTransactionDetails20.mmICCRelatedData, CardPaymentTransactionDetails25.mmICCRelatedData, CardPaymentTransactionDetails23.mmICCRelatedData, CardPaymentTransactionDetails21.mmICCRelatedData,
					CardPaymentTransactionDetails26.mmICCRelatedData, CardPaymentTransactionDetails19.mmICCRelatedData, CardPaymentTransactionDetails24.mmICCRelatedData, CardPaymentTransactionDetails32.mmICCRelatedData,
					CardPaymentTransactionDetails33.mmICCRelatedData, CardPaymentTransactionDetails28.mmICCRelatedData, CardPaymentTransactionDetails29.mmICCRelatedData, CardPaymentTransactionDetails30.mmICCRelatedData,
					CardPaymentTransactionDetails27.mmICCRelatedData, CardPaymentTransactionDetails31.mmICCRelatedData, DetailedAmount14.mmICCRelatedData, CardPaymentTransactionDetails34.mmICCRelatedData,
					CardPaymentTransactionDetails39.mmICCRelatedData, CardPaymentTransactionDetails38.mmICCRelatedData, CardPaymentTransactionDetails41.mmICCRelatedData, CardPaymentTransactionDetails37.mmICCRelatedData,
					CardPaymentTransactionDetails40.mmICCRelatedData, CardPaymentTransactionDetails42.mmICCRelatedData, CardPaymentTransactionDetails43.mmICCRelatedData);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to the interface of an integrated circuit card application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected CardPayment relatedCardPayment;
	/**
	 * Card payment which is at the origin of the acquiring process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAdvice1#mmTransaction
	 * ATMCompletionAdvice1.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement1#mmTransaction
	 * ATMCompletionAcknowledgement1.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAdvice2#mmTransaction
	 * ATMCompletionAdvice2.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#mmTransaction
	 * ATMCompletionAcknowledgement2.mmTransaction}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmRelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMCompletionAdvice1.mmTransaction, ATMCompletionAcknowledgement1.mmTransaction, ATMCompletionAdvice2.mmTransaction, ATMCompletionAcknowledgement2.mmTransaction);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which is at the origin of the acquiring process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};
	protected TrueFalseIndicator cardPresent;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmCardPresent
	 * PaymentContext3.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmCardPresent
	 * PaymentContext1.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmCardPresent
	 * PaymentContext4.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmCardPresent
	 * PaymentContext2.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmCardPresent
	 * PaymentContext7.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardPresent
	 * PaymentContext6.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmCardPresent
	 * PaymentContext5.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmCardPresent
	 * PaymentContext10.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmCardPresent
	 * PaymentContext8.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmCardPresent
	 * PaymentContext11.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmCardPresent
	 * PaymentContext13.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardPresent
	 * PaymentContext9.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmCardPresent
	 * PaymentContext12.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardPresent
	 * CardTransactionContext2.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmCardPresent
	 * PaymentContext17.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmCardPresent
	 * PaymentContext14.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmCardPresent
	 * PaymentContext18.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmCardPresent
	 * PaymentContext19.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmCardPresent
	 * PaymentContext16.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmCardPresent
	 * PaymentContext15.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmCardPresent
	 * PaymentContext22.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmCardPresent
	 * PaymentContext24.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmCardPresent
	 * PaymentContext20.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmCardPresent
	 * PaymentContext25.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmCardPresent
	 * PaymentContext21.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmCardPresent
	 * PaymentContext23.mmCardPresent}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardPresent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmCardPresent, PaymentContext1.mmCardPresent, PaymentContext4.mmCardPresent, PaymentContext2.mmCardPresent, PaymentContext7.mmCardPresent, PaymentContext6.mmCardPresent,
					PaymentContext5.mmCardPresent, PaymentContext10.mmCardPresent, PaymentContext8.mmCardPresent, PaymentContext11.mmCardPresent, PaymentContext13.mmCardPresent, PaymentContext9.mmCardPresent,
					PaymentContext12.mmCardPresent, CardTransactionContext2.mmCardPresent, PaymentContext17.mmCardPresent, PaymentContext14.mmCardPresent, PaymentContext18.mmCardPresent, PaymentContext19.mmCardPresent,
					PaymentContext16.mmCardPresent, PaymentContext15.mmCardPresent, PaymentContext22.mmCardPresent, PaymentContext24.mmCardPresent, PaymentContext20.mmCardPresent, PaymentContext25.mmCardPresent,
					PaymentContext21.mmCardPresent, PaymentContext23.mmCardPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator cardholderPresent;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmCardholderPresent
	 * PaymentContext3.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmCardholderPresent
	 * PaymentContext1.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmCardholderPresent
	 * PaymentContext4.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmCardholderPresent
	 * PaymentContext2.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmCardholderPresent
	 * PaymentContext7.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardholderPresent
	 * PaymentContext6.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmCardholderPresent
	 * PaymentContext5.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmCardholderPresent
	 * PaymentContext10.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmCardholderPresent
	 * PaymentContext8.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmCardholderPresent
	 * PaymentContext11.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmCardholderPresent
	 * PaymentContext13.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardholderPresent
	 * PaymentContext9.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmCardholderPresent
	 * PaymentContext12.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardholderPresent
	 * CardTransactionContext2.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmCardholderPresent
	 * PaymentContext17.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmCardholderPresent
	 * PaymentContext14.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmCardholderPresent
	 * PaymentContext18.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmCardholderPresent
	 * PaymentContext19.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmCardholderPresent
	 * PaymentContext16.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmCardholderPresent
	 * PaymentContext15.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmCardholderPresent
	 * PaymentContext22.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmCardholderPresent
	 * PaymentContext24.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmCardholderPresent
	 * PaymentContext20.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmCardholderPresent
	 * PaymentContext25.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmCardholderPresent
	 * PaymentContext21.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmCardholderPresent
	 * PaymentContext23.mmCardholderPresent}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardholderPresent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmCardholderPresent, PaymentContext1.mmCardholderPresent, PaymentContext4.mmCardholderPresent, PaymentContext2.mmCardholderPresent, PaymentContext7.mmCardholderPresent,
					PaymentContext6.mmCardholderPresent, PaymentContext5.mmCardholderPresent, PaymentContext10.mmCardholderPresent, PaymentContext8.mmCardholderPresent, PaymentContext11.mmCardholderPresent,
					PaymentContext13.mmCardholderPresent, PaymentContext9.mmCardholderPresent, PaymentContext12.mmCardholderPresent, CardTransactionContext2.mmCardholderPresent, PaymentContext17.mmCardholderPresent,
					PaymentContext14.mmCardholderPresent, PaymentContext18.mmCardholderPresent, PaymentContext19.mmCardholderPresent, PaymentContext16.mmCardholderPresent, PaymentContext15.mmCardholderPresent,
					PaymentContext22.mmCardholderPresent, PaymentContext24.mmCardholderPresent, PaymentContext20.mmCardholderPresent, PaymentContext25.mmCardholderPresent, PaymentContext21.mmCardholderPresent,
					PaymentContext23.mmCardholderPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator onLineContext;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmOnLineContext
	 * PaymentContext3.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmOnLineContext
	 * PaymentContext1.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmOnLineContext
	 * PaymentContext4.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmOnLineContext
	 * PaymentContext2.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmOnLineContext
	 * PaymentContext7.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmOnLineContext
	 * PaymentContext6.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmOnLineContext
	 * PaymentContext10.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmOnLineContext
	 * PaymentContext11.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmOnLineContext
	 * PaymentContext13.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmOnLineContext
	 * PaymentContext9.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmOnLineContext
	 * PaymentContext12.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmOnLineContext
	 * PaymentContext17.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmOnLineContext
	 * PaymentContext18.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmOnLineContext
	 * PaymentContext15.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmOnLineContext
	 * PaymentContext24.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmOnLineContext
	 * PaymentContext21.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmOnLineContext
	 * PaymentContext23.mmOnLineContext}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOnLineContext = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmOnLineContext, PaymentContext1.mmOnLineContext, PaymentContext4.mmOnLineContext, PaymentContext2.mmOnLineContext, PaymentContext7.mmOnLineContext,
					PaymentContext6.mmOnLineContext, PaymentContext10.mmOnLineContext, PaymentContext11.mmOnLineContext, PaymentContext13.mmOnLineContext, PaymentContext9.mmOnLineContext, PaymentContext12.mmOnLineContext,
					PaymentContext17.mmOnLineContext, PaymentContext18.mmOnLineContext, PaymentContext15.mmOnLineContext, PaymentContext24.mmOnLineContext, PaymentContext21.mmOnLineContext, PaymentContext23.mmOnLineContext);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected AttendanceContextCode attendanceContext;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmAttendanceContext
	 * PaymentContext3.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent1#mmAttendanceContext
	 * StatusReportContent1.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent2#mmAttendanceContext
	 * StatusReportContent2.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmAttendanceContext
	 * PaymentContext1.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmAttendanceContext
	 * PaymentContext4.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmAttendanceContext
	 * PaymentContext2.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmAttendanceContext
	 * PaymentContext7.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmAttendanceContext
	 * PaymentContext6.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmAttendanceContext
	 * PaymentContext5.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent3#mmAttendanceContext
	 * StatusReportContent3.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmAttendanceContext
	 * PaymentContext10.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmAttendanceContext
	 * PaymentContext8.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmAttendanceContext
	 * PaymentContext11.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmAttendanceContext
	 * PaymentContext13.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmAttendanceContext
	 * PaymentContext9.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmAttendanceContext
	 * PaymentContext12.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent4#mmAttendanceContext
	 * StatusReportContent4.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmAttendanceContext
	 * CardTransactionContext2.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent5#mmAttendanceContext
	 * StatusReportContent5.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmAttendanceContext
	 * PaymentContext17.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmAttendanceContext
	 * PaymentContext14.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmAttendanceContext
	 * PaymentContext18.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmAttendanceContext
	 * PaymentContext19.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmAttendanceContext
	 * PaymentContext16.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmAttendanceContext
	 * PaymentContext15.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmAttendanceContext
	 * PaymentContext22.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmAttendanceContext
	 * PaymentContext24.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmAttendanceContext
	 * PaymentContext20.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmAttendanceContext
	 * PaymentContext25.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmAttendanceContext
	 * PaymentContext21.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReportContent6#mmAttendanceContext
	 * StatusReportContent6.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmAttendanceContext
	 * PaymentContext23.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAttendanceContext = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmAttendanceContext, StatusReportContent1.mmAttendanceContext, StatusReportContent2.mmAttendanceContext, PaymentContext1.mmAttendanceContext,
					PaymentContext4.mmAttendanceContext, PaymentContext2.mmAttendanceContext, PaymentContext7.mmAttendanceContext, PaymentContext6.mmAttendanceContext, PaymentContext5.mmAttendanceContext,
					StatusReportContent3.mmAttendanceContext, PaymentContext10.mmAttendanceContext, PaymentContext8.mmAttendanceContext, PaymentContext11.mmAttendanceContext, PaymentContext13.mmAttendanceContext,
					PaymentContext9.mmAttendanceContext, PaymentContext12.mmAttendanceContext, StatusReportContent4.mmAttendanceContext, CardTransactionContext2.mmAttendanceContext, StatusReportContent5.mmAttendanceContext,
					PaymentContext17.mmAttendanceContext, PaymentContext14.mmAttendanceContext, PaymentContext18.mmAttendanceContext, PaymentContext19.mmAttendanceContext, PaymentContext16.mmAttendanceContext,
					PaymentContext15.mmAttendanceContext, PaymentContext22.mmAttendanceContext, PaymentContext24.mmAttendanceContext, PaymentContext20.mmAttendanceContext, PaymentContext25.mmAttendanceContext,
					PaymentContext21.mmAttendanceContext, StatusReportContent6.mmAttendanceContext, PaymentContext23.mmAttendanceContext);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI location during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AttendanceContextCode.mmObject();
		}
	};
	protected TransactionEnvironmentCode transactionEnvironment;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmTransactionEnvironment
	 * PaymentContext3.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmTransactionEnvironment
	 * PaymentContext1.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmTransactionEnvironment
	 * PaymentContext4.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmTransactionEnvironment
	 * PaymentContext2.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmTransactionEnvironment
	 * PaymentContext7.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmTransactionEnvironment
	 * PaymentContext6.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmTransactionEnvironment
	 * PaymentContext5.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmTransactionEnvironment
	 * PaymentContext10.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmTransactionEnvironment
	 * PaymentContext8.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmTransactionEnvironment
	 * PaymentContext11.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmTransactionEnvironment
	 * PaymentContext13.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmTransactionEnvironment
	 * PaymentContext9.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmTransactionEnvironment
	 * PaymentContext12.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmTransactionEnvironment
	 * CardTransactionContext2.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmTransactionEnvironment
	 * PaymentContext17.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmTransactionEnvironment
	 * PaymentContext14.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmTransactionEnvironment
	 * PaymentContext18.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmTransactionEnvironment
	 * PaymentContext19.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmTransactionEnvironment
	 * PaymentContext16.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmTransactionEnvironment
	 * PaymentContext15.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmTransactionEnvironment
	 * PaymentContext22.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmTransactionEnvironment
	 * PaymentContext24.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmTransactionEnvironment
	 * PaymentContext20.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmTransactionEnvironment
	 * PaymentContext25.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmTransactionEnvironment
	 * PaymentContext21.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmTransactionEnvironment
	 * PaymentContext23.mmTransactionEnvironment}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransactionEnvironment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmTransactionEnvironment, PaymentContext1.mmTransactionEnvironment, PaymentContext4.mmTransactionEnvironment, PaymentContext2.mmTransactionEnvironment,
					PaymentContext7.mmTransactionEnvironment, PaymentContext6.mmTransactionEnvironment, PaymentContext5.mmTransactionEnvironment, PaymentContext10.mmTransactionEnvironment, PaymentContext8.mmTransactionEnvironment,
					PaymentContext11.mmTransactionEnvironment, PaymentContext13.mmTransactionEnvironment, PaymentContext9.mmTransactionEnvironment, PaymentContext12.mmTransactionEnvironment,
					CardTransactionContext2.mmTransactionEnvironment, PaymentContext17.mmTransactionEnvironment, PaymentContext14.mmTransactionEnvironment, PaymentContext18.mmTransactionEnvironment,
					PaymentContext19.mmTransactionEnvironment, PaymentContext16.mmTransactionEnvironment, PaymentContext15.mmTransactionEnvironment, PaymentContext22.mmTransactionEnvironment, PaymentContext24.mmTransactionEnvironment,
					PaymentContext20.mmTransactionEnvironment, PaymentContext25.mmTransactionEnvironment, PaymentContext21.mmTransactionEnvironment, PaymentContext23.mmTransactionEnvironment);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionEnvironmentCode.mmObject();
		}
	};
	protected TransactionChannelCode transactionChannel;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmTransactionChannel
	 * PaymentContext3.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmTransactionChannel
	 * PaymentContext1.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmTransactionChannel
	 * PaymentContext4.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmTransactionChannel
	 * PaymentContext2.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmTransactionChannel
	 * PaymentContext7.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmTransactionChannel
	 * PaymentContext6.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmTransactionChannel
	 * PaymentContext5.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmTransactionChannel
	 * PaymentContext10.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmTransactionChannel
	 * PaymentContext8.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmTransactionChannel
	 * PaymentContext11.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmTransactionChannel
	 * PaymentContext13.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmTransactionChannel
	 * PaymentContext9.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmTransactionChannel
	 * PaymentContext12.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmTransactionChannel
	 * CardTransactionContext2.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmTransactionChannel
	 * PaymentContext17.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmTransactionChannel
	 * PaymentContext14.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmTransactionChannel
	 * PaymentContext18.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmTransactionChannel
	 * PaymentContext19.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmTransactionChannel
	 * PaymentContext16.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmTransactionChannel
	 * PaymentContext15.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmTransactionChannel
	 * PaymentContext22.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmTransactionChannel
	 * PaymentContext24.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmTransactionChannel
	 * PaymentContext20.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmTransactionChannel
	 * PaymentContext25.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmTransactionChannel
	 * PaymentContext21.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmTransactionChannel
	 * PaymentContext23.mmTransactionChannel}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransactionChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmTransactionChannel, PaymentContext1.mmTransactionChannel, PaymentContext4.mmTransactionChannel, PaymentContext2.mmTransactionChannel, PaymentContext7.mmTransactionChannel,
					PaymentContext6.mmTransactionChannel, PaymentContext5.mmTransactionChannel, PaymentContext10.mmTransactionChannel, PaymentContext8.mmTransactionChannel, PaymentContext11.mmTransactionChannel,
					PaymentContext13.mmTransactionChannel, PaymentContext9.mmTransactionChannel, PaymentContext12.mmTransactionChannel, CardTransactionContext2.mmTransactionChannel, PaymentContext17.mmTransactionChannel,
					PaymentContext14.mmTransactionChannel, PaymentContext18.mmTransactionChannel, PaymentContext19.mmTransactionChannel, PaymentContext16.mmTransactionChannel, PaymentContext15.mmTransactionChannel,
					PaymentContext22.mmTransactionChannel, PaymentContext24.mmTransactionChannel, PaymentContext20.mmTransactionChannel, PaymentContext25.mmTransactionChannel, PaymentContext21.mmTransactionChannel,
					PaymentContext23.mmTransactionChannel);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}
	};
	protected TrueFalseIndicator attendantMessageCapable;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmAttendantMessageCapable
	 * PaymentContext3.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmAttendantMessageCapable
	 * PaymentContext1.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmAttendantMessageCapable
	 * PaymentContext4.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmAttendantMessageCapable
	 * PaymentContext7.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmAttendantMessageCapable
	 * PaymentContext5.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmAttendantMessageCapable
	 * PaymentContext10.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmAttendantMessageCapable
	 * PaymentContext8.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmAttendantMessageCapable
	 * PaymentContext13.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmAttendantMessageCapable
	 * PaymentContext12.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmAttendantMessageCapable
	 * PaymentContext14.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmAttendantMessageCapable
	 * PaymentContext18.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmAttendantMessageCapable
	 * PaymentContext19.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmAttendantMessageCapable
	 * PaymentContext16.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmAttendantMessageCapable
	 * PaymentContext22.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmAttendantMessageCapable
	 * PaymentContext24.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmAttendantMessageCapable
	 * PaymentContext20.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmAttendantMessageCapable
	 * PaymentContext25.mmAttendantMessageCapable}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAttendantMessageCapable = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmAttendantMessageCapable, PaymentContext1.mmAttendantMessageCapable, PaymentContext4.mmAttendantMessageCapable, PaymentContext7.mmAttendantMessageCapable,
					PaymentContext5.mmAttendantMessageCapable, PaymentContext10.mmAttendantMessageCapable, PaymentContext8.mmAttendantMessageCapable, PaymentContext13.mmAttendantMessageCapable, PaymentContext12.mmAttendantMessageCapable,
					PaymentContext14.mmAttendantMessageCapable, PaymentContext18.mmAttendantMessageCapable, PaymentContext19.mmAttendantMessageCapable, PaymentContext16.mmAttendantMessageCapable, PaymentContext22.mmAttendantMessageCapable,
					PaymentContext24.mmAttendantMessageCapable, PaymentContext20.mmAttendantMessageCapable, PaymentContext25.mmAttendantMessageCapable);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ISO2ALanguageCode attendantLanguage;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmAttendantLanguage
	 * PaymentContext3.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmAttendantLanguage
	 * PaymentContext1.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmAttendantLanguage
	 * PaymentContext4.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmAttendantLanguage
	 * PaymentContext7.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmAttendantLanguage
	 * PaymentContext5.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmAttendantLanguage
	 * PaymentContext10.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmAttendantLanguage
	 * PaymentContext8.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmAttendantLanguage
	 * PaymentContext13.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmAttendantLanguage
	 * PaymentContext12.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmAttendantLanguage
	 * PaymentContext14.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmAttendantLanguage
	 * PaymentContext18.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmAttendantLanguage
	 * PaymentContext19.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmAttendantLanguage
	 * PaymentContext16.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmAttendantLanguage
	 * PaymentContext22.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmAttendantLanguage
	 * PaymentContext24.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmAttendantLanguage
	 * PaymentContext20.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmAttendantLanguage
	 * PaymentContext25.mmAttendantLanguage}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAttendantLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmAttendantLanguage, PaymentContext1.mmAttendantLanguage, PaymentContext4.mmAttendantLanguage, PaymentContext7.mmAttendantLanguage, PaymentContext5.mmAttendantLanguage,
					PaymentContext10.mmAttendantLanguage, PaymentContext8.mmAttendantLanguage, PaymentContext13.mmAttendantLanguage, PaymentContext12.mmAttendantLanguage, PaymentContext14.mmAttendantLanguage,
					PaymentContext18.mmAttendantLanguage, PaymentContext19.mmAttendantLanguage, PaymentContext16.mmAttendantLanguage, PaymentContext22.mmAttendantLanguage, PaymentContext24.mmAttendantLanguage,
					PaymentContext20.mmAttendantLanguage, PaymentContext25.mmAttendantLanguage);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	protected CardDataReadingCode cardDataEntryMode;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmCardDataEntryMode
	 * PaymentContext3.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmCardDataEntryMode
	 * PaymentContext1.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmCardDataEntryMode
	 * PaymentContext4.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmCardDataEntryMode
	 * PaymentContext2.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmCardDataEntryMode
	 * PaymentContext7.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardDataEntryMode
	 * PaymentContext6.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmCardDataEntryMode
	 * PaymentContext5.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext10#mmCardDataEntryMode
	 * PaymentContext10.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext8#mmCardDataEntryMode
	 * PaymentContext8.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext11#mmCardDataEntryMode
	 * PaymentContext11.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext13#mmCardDataEntryMode
	 * PaymentContext13.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardDataEntryMode
	 * PaymentContext9.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmCardDataEntryMode
	 * PaymentContext12.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardDataEntryMode
	 * CardTransactionContext2.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext17#mmCardDataEntryMode
	 * PaymentContext17.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext14#mmCardDataEntryMode
	 * PaymentContext14.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext18#mmCardDataEntryMode
	 * PaymentContext18.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext19#mmCardDataEntryMode
	 * PaymentContext19.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext16#mmCardDataEntryMode
	 * PaymentContext16.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmCardDataEntryMode
	 * PaymentContext15.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext22#mmCardDataEntryMode
	 * PaymentContext22.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext24#mmCardDataEntryMode
	 * PaymentContext24.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext20#mmCardDataEntryMode
	 * PaymentContext20.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext25#mmCardDataEntryMode
	 * PaymentContext25.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext21#mmCardDataEntryMode
	 * PaymentContext21.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext23#mmCardDataEntryMode
	 * PaymentContext23.mmCardDataEntryMode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCardDataEntryMode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmCardDataEntryMode, PaymentContext1.mmCardDataEntryMode, PaymentContext4.mmCardDataEntryMode, PaymentContext2.mmCardDataEntryMode, PaymentContext7.mmCardDataEntryMode,
					PaymentContext6.mmCardDataEntryMode, PaymentContext5.mmCardDataEntryMode, PaymentContext10.mmCardDataEntryMode, PaymentContext8.mmCardDataEntryMode, PaymentContext11.mmCardDataEntryMode,
					PaymentContext13.mmCardDataEntryMode, PaymentContext9.mmCardDataEntryMode, PaymentContext12.mmCardDataEntryMode, CardTransactionContext2.mmCardDataEntryMode, PaymentContext17.mmCardDataEntryMode,
					PaymentContext14.mmCardDataEntryMode, PaymentContext18.mmCardDataEntryMode, PaymentContext19.mmCardDataEntryMode, PaymentContext16.mmCardDataEntryMode, PaymentContext15.mmCardDataEntryMode,
					PaymentContext22.mmCardDataEntryMode, PaymentContext24.mmCardDataEntryMode, PaymentContext20.mmCardDataEntryMode, PaymentContext25.mmCardDataEntryMode, PaymentContext21.mmCardDataEntryMode,
					PaymentContext23.mmCardDataEntryMode);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}
	};
	protected TrueFalseIndicator fallbackIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmFallbackIndicator
	 * PaymentContext3.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext1#mmFallbackIndicator
	 * PaymentContext1.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmFallbackIndicator
	 * PaymentContext4.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmFallbackIndicator
	 * PaymentContext2.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmFallbackIndicator
	 * PaymentContext7.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmFallbackIndicator
	 * PaymentContext6.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext5#mmFallbackIndicator
	 * PaymentContext5.mmFallbackIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmFallbackIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmFallbackIndicator, PaymentContext1.mmFallbackIndicator, PaymentContext4.mmFallbackIndicator, PaymentContext2.mmFallbackIndicator, PaymentContext7.mmFallbackIndicator,
					PaymentContext6.mmFallbackIndicator, PaymentContext5.mmFallbackIndicator);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a transaction fallback.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TerminalManagementSystem> tMSTrigger;
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
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmCardPaymentAcquiring
	 * TerminalManagementSystem.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse1#mmTMSTrigger
	 * AcceptorDiagnosticResponse1.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse2#mmTMSTrigger
	 * AcceptorDiagnosticResponse2.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#mmTMSTrigger
	 * AuthorisationResult1.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#mmTMSTrigger
	 * AuthorisationResult3.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse1.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse2.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse1.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse2.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse3#mmTMSTrigger
	 * AcceptorDiagnosticResponse3.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse3.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse3.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse4#mmTMSTrigger
	 * AcceptorDiagnosticResponse4.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse4.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse4.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmTMSTrigger
	 * AuthorisationResult4.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#mmTMSTrigger
	 * AuthorisationResult6.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse5.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse5.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#mmTMSTrigger
	 * AuthorisationResult12.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmTMSTrigger
	 * AuthorisationResult10.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse6.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#mmTMSTrigger
	 * AcceptorCompletionAdviceResponse6.mmTMSTrigger}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTMSTrigger = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorDiagnosticResponse1.mmTMSTrigger, AcceptorDiagnosticResponse2.mmTMSTrigger, AuthorisationResult1.mmTMSTrigger, AuthorisationResult3.mmTMSTrigger,
					AcceptorCancellationAdviceResponse1.mmTMSTrigger, AcceptorCancellationAdviceResponse2.mmTMSTrigger, AcceptorCompletionAdviceResponse1.mmTMSTrigger, AcceptorCompletionAdviceResponse2.mmTMSTrigger,
					AcceptorDiagnosticResponse3.mmTMSTrigger, AcceptorCancellationAdviceResponse3.mmTMSTrigger, AcceptorCompletionAdviceResponse3.mmTMSTrigger, AcceptorDiagnosticResponse4.mmTMSTrigger,
					AcceptorCancellationAdviceResponse4.mmTMSTrigger, AcceptorCompletionAdviceResponse4.mmTMSTrigger, AuthorisationResult4.mmTMSTrigger, AuthorisationResult6.mmTMSTrigger, AcceptorCancellationAdviceResponse5.mmTMSTrigger,
					AcceptorCompletionAdviceResponse5.mmTMSTrigger, AuthorisationResult12.mmTMSTrigger, AuthorisationResult10.mmTMSTrigger, AcceptorCancellationAdviceResponse6.mmTMSTrigger, AcceptorCompletionAdviceResponse6.mmTMSTrigger);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TMSTrigger";
			definition = "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmCardPaymentAcquiring;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};
	protected Max35Text initiatorTransactionIdentifier;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction8#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction8.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction4.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction17.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction14.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction1.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction11.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction19.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction3.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction21.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction22.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction31.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction29.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction36.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction45.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction37.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction47.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmInitiatorTransactionIdentification
	 * CardTransaction10.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmInitiatorTransactionIdentification
	 * CardTransaction9.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmInitiatorTransactionIdentification
	 * CardTransaction6.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction52.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction60.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction51.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction62.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction71.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction70.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmInitiatorTransactionIdentification
	 * CardPaymentTransaction76.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInitiatorTransactionIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction8.mmInitiatorTransactionIdentification, CardPaymentTransaction4.mmInitiatorTransactionIdentification, CardPaymentTransaction17.mmInitiatorTransactionIdentification,
					CardPaymentTransaction14.mmInitiatorTransactionIdentification, CardPaymentTransaction1.mmInitiatorTransactionIdentification, CardPaymentTransaction11.mmInitiatorTransactionIdentification,
					CardPaymentTransaction19.mmInitiatorTransactionIdentification, CardPaymentTransaction3.mmInitiatorTransactionIdentification, CardPaymentTransaction21.mmInitiatorTransactionIdentification,
					CardPaymentTransaction22.mmInitiatorTransactionIdentification, CardPaymentTransaction31.mmInitiatorTransactionIdentification, CardPaymentTransaction29.mmInitiatorTransactionIdentification,
					CardPaymentTransaction36.mmInitiatorTransactionIdentification, CardPaymentTransaction45.mmInitiatorTransactionIdentification, CardPaymentTransaction37.mmInitiatorTransactionIdentification,
					CardPaymentTransaction47.mmInitiatorTransactionIdentification, CardTransaction10.mmInitiatorTransactionIdentification, CardTransaction9.mmInitiatorTransactionIdentification,
					CardTransaction6.mmInitiatorTransactionIdentification, CardPaymentTransaction52.mmInitiatorTransactionIdentification, CardPaymentTransaction60.mmInitiatorTransactionIdentification,
					CardPaymentTransaction51.mmInitiatorTransactionIdentification, CardPaymentTransaction62.mmInitiatorTransactionIdentification, CardPaymentTransaction71.mmInitiatorTransactionIdentification,
					CardPaymentTransaction70.mmInitiatorTransactionIdentification, CardPaymentTransaction76.mmInitiatorTransactionIdentification);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitiatorTransactionIdentifier";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TrueFalseIndicator reversal;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmReversal
	 * CardPaymentTransaction4.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmReversal
	 * CardPaymentTransaction14.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmReversal
	 * CardPaymentTransaction7.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmReversal
	 * CardPaymentTransaction16.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmReversal
	 * CardPaymentTransaction20.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmReversal
	 * CardPaymentTransaction3.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmReversal
	 * CardPaymentTransaction13.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmReversal
	 * CardPaymentTransaction28.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmReversal
	 * CardPaymentTransaction29.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmReversal
	 * CardPaymentTransaction25.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmReversal
	 * CardPaymentTransaction30.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmReversal
	 * CardPaymentTransaction44.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmReversal
	 * CardPaymentTransaction45.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmReversal
	 * CardPaymentTransaction46.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmReversal
	 * CardPaymentTransaction40.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmReversal
	 * CardPaymentTransaction60.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmReversal
	 * CardPaymentTransaction61.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmReversal
	 * CardPaymentTransaction59.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmReversal
	 * CardPaymentTransaction55.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmReversal
	 * CardPaymentTransaction75.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmReversal
	 * CardPaymentTransaction70.mmReversal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmReversal
	 * CardPaymentTransaction69.mmReversal}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmReversal = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction4.mmReversal, CardPaymentTransaction14.mmReversal, CardPaymentTransaction7.mmReversal, CardPaymentTransaction16.mmReversal, CardPaymentTransaction20.mmReversal,
					CardPaymentTransaction3.mmReversal, CardPaymentTransaction13.mmReversal, CardPaymentTransaction28.mmReversal, CardPaymentTransaction29.mmReversal, CardPaymentTransaction25.mmReversal,
					CardPaymentTransaction30.mmReversal, CardPaymentTransaction44.mmReversal, CardPaymentTransaction45.mmReversal, CardPaymentTransaction46.mmReversal, CardPaymentTransaction40.mmReversal,
					CardPaymentTransaction60.mmReversal, CardPaymentTransaction61.mmReversal, CardPaymentTransaction59.mmReversal, CardPaymentTransaction55.mmReversal, CardPaymentTransaction75.mmReversal,
					CardPaymentTransaction70.mmReversal, CardPaymentTransaction69.mmReversal);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Max35Text interchangeData;
	/**
	 * Interchange information related to the card scheme.
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmInterchangeData
	 * CardPaymentTransaction4.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmInterchangeData
	 * CardPaymentTransaction14.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmInterchangeData
	 * CardPaymentTransaction7.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmInterchangeData
	 * CardPaymentTransaction16.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmInterchangeData
	 * CardPaymentTransaction20.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction2#mmInterchangeData
	 * CardPaymentTransaction2.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction12#mmInterchangeData
	 * CardPaymentTransaction12.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction6#mmInterchangeData
	 * CardPaymentTransaction6.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmInterchangeData
	 * CardPaymentTransaction3.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmInterchangeData
	 * CardPaymentTransaction13.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmInterchangeData
	 * CardPaymentTransaction28.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction32#mmInterchangeData
	 * CardPaymentTransaction32.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction35#mmInterchangeData
	 * CardPaymentTransaction35.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23#mmInterchangeData
	 * CardPaymentTransaction23.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmInterchangeData
	 * CardPaymentTransaction29.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmInterchangeData
	 * CardPaymentTransaction25.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmInterchangeData
	 * CardPaymentTransaction30.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction38#mmInterchangeData
	 * CardPaymentTransaction38.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction48#mmInterchangeData
	 * CardPaymentTransaction48.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction42#mmInterchangeData
	 * CardPaymentTransaction42.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmInterchangeData
	 * CardPaymentTransaction44.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmInterchangeData
	 * CardPaymentTransaction45.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmInterchangeData
	 * CardPaymentTransaction46.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmInterchangeData
	 * CardPaymentTransaction40.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction63#mmInterchangeData
	 * CardPaymentTransaction63.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmInterchangeData
	 * CardPaymentTransaction60.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction57#mmInterchangeData
	 * CardPaymentTransaction57.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmInterchangeData
	 * CardPaymentTransaction61.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53#mmInterchangeData
	 * CardPaymentTransaction53.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmInterchangeData
	 * CardPaymentTransaction59.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmInterchangeData
	 * CardPaymentTransaction55.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmInterchangeData
	 * CardPaymentTransaction75.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmInterchangeData
	 * CardPaymentTransaction70.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmInterchangeData
	 * CardPaymentTransaction69.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction77#mmInterchangeData
	 * CardPaymentTransaction77.mmInterchangeData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction78#mmInterchangeData
	 * CardPaymentTransaction78.mmInterchangeData}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInterchangeData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction4.mmInterchangeData, CardPaymentTransaction14.mmInterchangeData, CardPaymentTransaction7.mmInterchangeData, CardPaymentTransaction16.mmInterchangeData,
					CardPaymentTransaction20.mmInterchangeData, CardPaymentTransaction2.mmInterchangeData, CardPaymentTransaction12.mmInterchangeData, CardPaymentTransaction6.mmInterchangeData, CardPaymentTransaction3.mmInterchangeData,
					CardPaymentTransaction13.mmInterchangeData, CardPaymentTransaction28.mmInterchangeData, CardPaymentTransaction32.mmInterchangeData, CardPaymentTransaction35.mmInterchangeData, CardPaymentTransaction23.mmInterchangeData,
					CardPaymentTransaction29.mmInterchangeData, CardPaymentTransaction25.mmInterchangeData, CardPaymentTransaction30.mmInterchangeData, CardPaymentTransaction38.mmInterchangeData, CardPaymentTransaction48.mmInterchangeData,
					CardPaymentTransaction42.mmInterchangeData, CardPaymentTransaction44.mmInterchangeData, CardPaymentTransaction45.mmInterchangeData, CardPaymentTransaction46.mmInterchangeData, CardPaymentTransaction40.mmInterchangeData,
					CardPaymentTransaction63.mmInterchangeData, CardPaymentTransaction60.mmInterchangeData, CardPaymentTransaction57.mmInterchangeData, CardPaymentTransaction61.mmInterchangeData, CardPaymentTransaction53.mmInterchangeData,
					CardPaymentTransaction59.mmInterchangeData, CardPaymentTransaction55.mmInterchangeData, CardPaymentTransaction75.mmInterchangeData, CardPaymentTransaction70.mmInterchangeData, CardPaymentTransaction69.mmInterchangeData,
					CardPaymentTransaction77.mmInterchangeData, CardPaymentTransaction78.mmInterchangeData);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35NumericText unattendedLevelCategory;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails4.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails1.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails10.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails3.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails12.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails16.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails14.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails15.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails23.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails21.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails19.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails24.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmUnattendedLevelCategory
	 * CardTransactionDetail1.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails29.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails30.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails27.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails31.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails39.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails38.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails41.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails37.mmUnattendedLevelCategory}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmUnattendedLevelCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails4.mmUnattendedLevelCategory, CardPaymentTransactionDetails1.mmUnattendedLevelCategory, CardPaymentTransactionDetails10.mmUnattendedLevelCategory,
					CardPaymentTransactionDetails3.mmUnattendedLevelCategory, CardPaymentTransactionDetails12.mmUnattendedLevelCategory, CardPaymentTransactionDetails16.mmUnattendedLevelCategory,
					CardPaymentTransactionDetails14.mmUnattendedLevelCategory, CardPaymentTransactionDetails15.mmUnattendedLevelCategory, CardPaymentTransactionDetails23.mmUnattendedLevelCategory,
					CardPaymentTransactionDetails21.mmUnattendedLevelCategory, CardPaymentTransactionDetails19.mmUnattendedLevelCategory, CardPaymentTransactionDetails24.mmUnattendedLevelCategory,
					CardTransactionDetail1.mmUnattendedLevelCategory, CardPaymentTransactionDetails29.mmUnattendedLevelCategory, CardPaymentTransactionDetails30.mmUnattendedLevelCategory,
					CardPaymentTransactionDetails27.mmUnattendedLevelCategory, CardPaymentTransactionDetails31.mmUnattendedLevelCategory, CardPaymentTransactionDetails39.mmUnattendedLevelCategory,
					CardPaymentTransactionDetails38.mmUnattendedLevelCategory, CardPaymentTransactionDetails41.mmUnattendedLevelCategory, CardPaymentTransactionDetails37.mmUnattendedLevelCategory);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentValidation> validation;
	/**
	 * Results and parameters of the card payment verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
	 * CardPaymentValidation.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmAuthorisationResult
	 * CardPaymentTransaction4.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmAuthorisationResult
	 * CardPaymentTransaction14.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmAuthorisationResult
	 * CardPaymentTransaction7.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmAuthorisationResult
	 * CardPaymentTransaction16.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmAuthorisationResult
	 * CardPaymentTransaction20.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#mmAuthorisationResult
	 * CardPaymentTransaction9.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmAuthorisationResult
	 * CardPaymentTransaction18.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction10#mmAuthorisationResult
	 * CardPaymentTransaction10.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmAuthorisationResult
	 * CardPaymentTransaction3.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmAuthorisationResult
	 * CardPaymentTransaction13.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmAuthorisationResult
	 * CardPaymentTransaction28.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction27#mmAuthorisationResult
	 * CardPaymentTransaction27.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmAuthorisationResult
	 * CardPaymentTransaction24.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmAuthorisationResult
	 * CardPaymentTransaction29.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmAuthorisationResult
	 * CardPaymentTransaction25.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmAuthorisationResult
	 * CardPaymentTransaction30.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmAuthorisationResult
	 * CardPaymentTransaction39.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction43#mmAuthorisationResult
	 * CardPaymentTransaction43.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmAuthorisationResult
	 * CardPaymentTransaction44.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmAuthorisationResult
	 * CardPaymentTransaction45.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmAuthorisationResult
	 * CardPaymentTransaction46.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmAuthorisationResult
	 * CardPaymentTransaction40.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction5#mmAuthorisationResult
	 * ATMTransaction5.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmAuthorisationResult
	 * ATMTransaction2.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmAuthorisationResult
	 * ATMTransaction3.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmAuthorisationResult
	 * CardTransaction5.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAuthorisationResult
	 * CardTransaction15.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmAuthorisationResult
	 * CardPaymentTransaction60.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmAuthorisationResult
	 * CardPaymentTransaction61.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmAuthorisationResult
	 * CardPaymentTransaction59.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmAuthorisationResult
	 * CardPaymentTransaction54.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmAuthorisationResult
	 * CardPaymentTransaction55.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction58#mmAuthorisationResult
	 * CardPaymentTransaction58.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#mmAuthorisationResult
	 * ATMTransaction14.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmAuthorisationResult
	 * ATMTransaction17.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmAuthorisationResult
	 * ATMTransaction20.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmAuthorisationResult
	 * CardPaymentTransaction75.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmAuthorisationResult
	 * CardPaymentTransaction67.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmAuthorisationResult
	 * CardPaymentTransaction70.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction68#mmAuthorisationResult
	 * CardPaymentTransaction68.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmAuthorisationResult
	 * CardPaymentTransaction69.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmValidation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction4.mmAuthorisationResult, CardPaymentTransaction14.mmAuthorisationResult, CardPaymentTransaction7.mmAuthorisationResult, CardPaymentTransaction16.mmAuthorisationResult,
					CardPaymentTransaction20.mmAuthorisationResult, CardPaymentTransaction9.mmAuthorisationResult, CardPaymentTransaction18.mmAuthorisationResult, CardPaymentTransaction10.mmAuthorisationResult,
					CardPaymentTransaction3.mmAuthorisationResult, CardPaymentTransaction13.mmAuthorisationResult, CardPaymentTransaction28.mmAuthorisationResult, CardPaymentTransaction27.mmAuthorisationResult,
					CardPaymentTransaction24.mmAuthorisationResult, CardPaymentTransaction29.mmAuthorisationResult, CardPaymentTransaction25.mmAuthorisationResult, CardPaymentTransaction30.mmAuthorisationResult,
					CardPaymentTransaction39.mmAuthorisationResult, CardPaymentTransaction43.mmAuthorisationResult, CardPaymentTransaction44.mmAuthorisationResult, CardPaymentTransaction45.mmAuthorisationResult,
					CardPaymentTransaction46.mmAuthorisationResult, CardPaymentTransaction40.mmAuthorisationResult, ATMTransaction5.mmAuthorisationResult, ATMTransaction2.mmAuthorisationResult, ATMTransaction3.mmAuthorisationResult,
					CardTransaction5.mmAuthorisationResult, CardTransaction15.mmAuthorisationResult, CardPaymentTransaction60.mmAuthorisationResult, CardPaymentTransaction61.mmAuthorisationResult,
					CardPaymentTransaction59.mmAuthorisationResult, CardPaymentTransaction54.mmAuthorisationResult, CardPaymentTransaction55.mmAuthorisationResult, CardPaymentTransaction58.mmAuthorisationResult,
					ATMTransaction14.mmAuthorisationResult, ATMTransaction17.mmAuthorisationResult, ATMTransaction20.mmAuthorisationResult, CardPaymentTransaction75.mmAuthorisationResult, CardPaymentTransaction67.mmAuthorisationResult,
					CardPaymentTransaction70.mmAuthorisationResult, CardPaymentTransaction68.mmAuthorisationResult, CardPaymentTransaction69.mmAuthorisationResult);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Validation";
			definition = "Results and parameters of the card payment verification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
		}
	};
	protected TrueFalseIndicator completionRequired;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#mmCompletionRequired
	 * AuthorisationResult1.mmCompletionRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmCompletionRequired
	 * AuthorisationResult4.mmCompletionRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmCompletionRequired
	 * AuthorisationResult10.mmCompletionRequired}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCompletionRequired = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AuthorisationResult1.mmCompletionRequired, AuthorisationResult4.mmCompletionRequired, AuthorisationResult10.mmCompletionRequired);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompletionRequired";
			definition = "Indicates whether the acquirer requires a further exchange after the completion of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ActionTypeCode actionType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Action1#mmActionType
	 * Action1.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action2#mmActionType
	 * Action2.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action3#mmActionType
	 * Action3.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action4#mmActionType
	 * Action4.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action5#mmActionType
	 * Action5.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action6#mmActionType
	 * Action6.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action7#mmActionType
	 * Action7.mmActionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action8#mmActionType
	 * Action8.mmActionType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmActionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Action1.mmActionType, Action2.mmActionType, Action3.mmActionType, Action4.mmActionType, Action5.mmActionType, Action6.mmActionType, Action7.mmActionType, Action8.mmActionType);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionType";
			definition = "Type of action to be performed by the POI (Point Of Interaction) system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActionTypeCode.mmObject();
		}
	};
	protected Max256Text actionMessage;
	/**
	 * Message to be displayed or printed to the cardholder or the cashier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1#mmMessageContent
	 * ActionMessage1.mmMessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action1#mmMessageToPresent
	 * Action1.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action2#mmMessageToPresent
	 * Action2.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action3#mmMessageToPresent
	 * Action3.mmMessageToPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageContent
	 * ActionMessage2.mmMessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action4#mmMessageToPresent
	 * Action4.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action5#mmMessageToPresent
	 * Action5.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage4#mmMessage
	 * ActionMessage4.mmMessage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3#mmContent
	 * ActionMessage3.mmContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage5#mmMessageContent
	 * ActionMessage5.mmMessageContent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action6#mmMessageToPresent
	 * Action6.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action7#mmMessageToPresent
	 * Action7.mmMessageToPresent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Action8#mmMessageToPresent
	 * Action8.mmMessageToPresent}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmActionMessage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ActionMessage1.mmMessageContent, Action1.mmMessageToPresent, Action2.mmMessageToPresent, Action3.mmMessageToPresent, ActionMessage2.mmMessageContent, Action4.mmMessageToPresent,
					Action5.mmMessageToPresent, ActionMessage4.mmMessage, ActionMessage3.mmContent, ActionMessage5.mmMessageContent, Action6.mmMessageToPresent, Action7.mmMessageToPresent, Action8.mmMessageToPresent);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionMessage";
			definition = "Message to be displayed or printed to the cardholder or the cashier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected TrueFalseIndicator captureIndicator;
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
	public static final MMBusinessAttribute mmCaptureIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CaptureIndicator";
			definition = "Indicates whether the transaction is captured or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Max35Text recipientTransactionIdentification;
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
	public static final MMBusinessAttribute mmRecipientTransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected LocationCategoryCode location;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmLocationCategory
	 * CardTransactionContext2.mmLocationCategory}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmLocation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardTransactionContext2.mmLocationCategory);
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LocationCategoryCode.mmObject();
		}
	};
	protected Country country;
	/**
	 * Country of the merchant where the transaction took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedCardPayment
	 * Country.mmRelatedCardPayment}</li>
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
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the merchant where the transaction took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmRelatedCardPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentAcquiring";
				definition = "Payment processes initiated by a payment card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmRelatedCardPayment, com.tools20022.repository.entity.CardPayment.mmCardPaymentAcquiring,
						com.tools20022.repository.entity.PointOfInteraction.mmCardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.mmCardPaymentAcquiring,
						com.tools20022.repository.entity.CardPaymentValidation.mmCardPayment);
				derivationElement_lazy = () -> Arrays.asList(CardPaymentContext3.mmPaymentContext, CardPaymentContext3.mmSaleContext, CardPaymentContext4.mmPaymentContext, CardPaymentContext4.mmSaleContext,
						CardPaymentContext1.mmPaymentContext, CardPaymentContext1.mmSaleContext, CardPaymentContext2.mmPaymentContext, CardPaymentContext2.mmSaleContext, CardPaymentContext7.mmPaymentContext,
						CardPaymentContext7.mmSaleContext, CardPaymentContext6.mmPaymentContext, CardPaymentContext6.mmSaleContext, CardPaymentContext5.mmPaymentContext, CardPaymentContext5.mmSaleContext,
						CardPaymentContext8.mmPaymentContext, CardPaymentContext8.mmSaleContext, CardPaymentContext11.mmPaymentContext, CardPaymentContext11.mmSaleContext, CardPaymentContext13.mmPaymentContext,
						CardPaymentContext13.mmSaleContext, CardPaymentContext9.mmPaymentContext, CardPaymentContext9.mmSaleContext, CardPaymentContext12.mmPaymentContext, CardPaymentContext12.mmSaleContext,
						CardPaymentContext10.mmPaymentContext, CardPaymentContext10.mmSaleContext, AuthorisationResult8.mmAction, CardTransactionContext3.mmTransactionContext, CardTransactionContext1.mmTransactionContext,
						CardTransactionContext1.mmSaleContext, CardTransaction6.mmReconciliation, CardPaymentContext18.mmPaymentContext, CardPaymentContext18.mmSaleContext, CardPaymentContext14.mmPaymentContext,
						CardPaymentContext14.mmSaleContext, CardPaymentContext17.mmPaymentContext, CardPaymentContext17.mmSaleContext, CardPaymentContext19.mmPaymentContext, CardPaymentContext19.mmSaleContext,
						CardPaymentContext16.mmPaymentContext, CardPaymentContext16.mmSaleContext, CardPaymentContext15.mmPaymentContext, CardPaymentContext15.mmSaleContext, CardPaymentContext25.mmPaymentContext,
						CardPaymentContext25.mmSaleContext, CardPaymentContext24.mmPaymentContext, CardPaymentContext24.mmSaleContext, CardPaymentContext20.mmPaymentContext, CardPaymentContext20.mmSaleContext,
						CardPaymentContext21.mmPaymentContext, CardPaymentContext21.mmSaleContext, CardPaymentContext22.mmPaymentContext, CardPaymentContext22.mmSaleContext, CardPaymentContext23.mmPaymentContext,
						CardPaymentContext23.mmSaleContext);
				element_lazy = () -> Arrays.asList(CardPaymentAcquiring.mmPointOfInteraction, CardPaymentAcquiring.mmCardPaymentService, CardPaymentAcquiring.mmTransactionIdentification, CardPaymentAcquiring.mmTransactionDateTime,
						CardPaymentAcquiring.mmICCRelatedData, CardPaymentAcquiring.mmRelatedCardPayment, CardPaymentAcquiring.mmCardPresent, CardPaymentAcquiring.mmCardholderPresent, CardPaymentAcquiring.mmOnLineContext,
						CardPaymentAcquiring.mmAttendanceContext, CardPaymentAcquiring.mmTransactionEnvironment, CardPaymentAcquiring.mmTransactionChannel, CardPaymentAcquiring.mmAttendantMessageCapable,
						CardPaymentAcquiring.mmAttendantLanguage, CardPaymentAcquiring.mmCardDataEntryMode, CardPaymentAcquiring.mmFallbackIndicator, CardPaymentAcquiring.mmTMSTrigger, CardPaymentAcquiring.mmInitiatorTransactionIdentifier,
						CardPaymentAcquiring.mmReversal, CardPaymentAcquiring.mmInterchangeData, CardPaymentAcquiring.mmUnattendedLevelCategory, CardPaymentAcquiring.mmValidation, CardPaymentAcquiring.mmCompletionRequired,
						CardPaymentAcquiring.mmActionType, CardPaymentAcquiring.mmActionMessage, CardPaymentAcquiring.mmCaptureIndicator, CardPaymentAcquiring.mmRecipientTransactionIdentification, CardPaymentAcquiring.mmLocation,
						CardPaymentAcquiring.mmCountry);
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

	public PointOfInteraction getPointOfInteraction() {
		return pointOfInteraction;
	}

	public void setPointOfInteraction(com.tools20022.repository.entity.PointOfInteraction pointOfInteraction) {
		this.pointOfInteraction = pointOfInteraction;
	}

	public CardPaymentServiceTypeCode getCardPaymentService() {
		return cardPaymentService;
	}

	public void setCardPaymentService(CardPaymentServiceTypeCode cardPaymentService) {
		this.cardPaymentService = cardPaymentService;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public ISODateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(ISODateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}

	public CardPayment getRelatedCardPayment() {
		return relatedCardPayment;
	}

	public void setRelatedCardPayment(com.tools20022.repository.entity.CardPayment relatedCardPayment) {
		this.relatedCardPayment = relatedCardPayment;
	}

	public TrueFalseIndicator getCardPresent() {
		return cardPresent;
	}

	public void setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = cardPresent;
	}

	public TrueFalseIndicator getCardholderPresent() {
		return cardholderPresent;
	}

	public void setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
	}

	public TrueFalseIndicator getOnLineContext() {
		return onLineContext;
	}

	public void setOnLineContext(TrueFalseIndicator onLineContext) {
		this.onLineContext = onLineContext;
	}

	public AttendanceContextCode getAttendanceContext() {
		return attendanceContext;
	}

	public void setAttendanceContext(AttendanceContextCode attendanceContext) {
		this.attendanceContext = attendanceContext;
	}

	public TransactionEnvironmentCode getTransactionEnvironment() {
		return transactionEnvironment;
	}

	public void setTransactionEnvironment(TransactionEnvironmentCode transactionEnvironment) {
		this.transactionEnvironment = transactionEnvironment;
	}

	public TransactionChannelCode getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(TransactionChannelCode transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public TrueFalseIndicator getAttendantMessageCapable() {
		return attendantMessageCapable;
	}

	public void setAttendantMessageCapable(TrueFalseIndicator attendantMessageCapable) {
		this.attendantMessageCapable = attendantMessageCapable;
	}

	public ISO2ALanguageCode getAttendantLanguage() {
		return attendantLanguage;
	}

	public void setAttendantLanguage(ISO2ALanguageCode attendantLanguage) {
		this.attendantLanguage = attendantLanguage;
	}

	public CardDataReadingCode getCardDataEntryMode() {
		return cardDataEntryMode;
	}

	public void setCardDataEntryMode(CardDataReadingCode cardDataEntryMode) {
		this.cardDataEntryMode = cardDataEntryMode;
	}

	public TrueFalseIndicator getFallbackIndicator() {
		return fallbackIndicator;
	}

	public void setFallbackIndicator(TrueFalseIndicator fallbackIndicator) {
		this.fallbackIndicator = fallbackIndicator;
	}

	public List<TerminalManagementSystem> getTMSTrigger() {
		return tMSTrigger;
	}

	public void setTMSTrigger(List<com.tools20022.repository.entity.TerminalManagementSystem> tMSTrigger) {
		this.tMSTrigger = tMSTrigger;
	}

	public Max35Text getInitiatorTransactionIdentifier() {
		return initiatorTransactionIdentifier;
	}

	public void setInitiatorTransactionIdentifier(Max35Text initiatorTransactionIdentifier) {
		this.initiatorTransactionIdentifier = initiatorTransactionIdentifier;
	}

	public TrueFalseIndicator getReversal() {
		return reversal;
	}

	public void setReversal(TrueFalseIndicator reversal) {
		this.reversal = reversal;
	}

	public Max35Text getInterchangeData() {
		return interchangeData;
	}

	public void setInterchangeData(Max35Text interchangeData) {
		this.interchangeData = interchangeData;
	}

	public Max35NumericText getUnattendedLevelCategory() {
		return unattendedLevelCategory;
	}

	public void setUnattendedLevelCategory(Max35NumericText unattendedLevelCategory) {
		this.unattendedLevelCategory = unattendedLevelCategory;
	}

	public List<CardPaymentValidation> getValidation() {
		return validation;
	}

	public void setValidation(List<com.tools20022.repository.entity.CardPaymentValidation> validation) {
		this.validation = validation;
	}

	public TrueFalseIndicator getCompletionRequired() {
		return completionRequired;
	}

	public void setCompletionRequired(TrueFalseIndicator completionRequired) {
		this.completionRequired = completionRequired;
	}

	public ActionTypeCode getActionType() {
		return actionType;
	}

	public void setActionType(ActionTypeCode actionType) {
		this.actionType = actionType;
	}

	public Max256Text getActionMessage() {
		return actionMessage;
	}

	public void setActionMessage(Max256Text actionMessage) {
		this.actionMessage = actionMessage;
	}

	public TrueFalseIndicator getCaptureIndicator() {
		return captureIndicator;
	}

	public void setCaptureIndicator(TrueFalseIndicator captureIndicator) {
		this.captureIndicator = captureIndicator;
	}

	public Max35Text getRecipientTransactionIdentification() {
		return recipientTransactionIdentification;
	}

	public void setRecipientTransactionIdentification(Max35Text recipientTransactionIdentification) {
		this.recipientTransactionIdentification = recipientTransactionIdentification;
	}

	public LocationCategoryCode getLocation() {
		return location;
	}

	public void setLocation(LocationCategoryCode location) {
		this.location = location;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}
}