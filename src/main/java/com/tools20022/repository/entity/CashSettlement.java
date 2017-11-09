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
import com.tools20022.repository.choice.PaymentSchemeChoice;
import com.tools20022.repository.choice.PaymentStatusCode5Choice;
import com.tools20022.repository.choice.PaymentStatusCode6Choice;
import com.tools20022.repository.codeset.SettlementMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Instruction between two financial institutions stipulating the cash transfer
 * characteristics between the two parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashSettlement" src="doc-files/CashSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation3
 * SettlementInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation1
 * SettlementInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation13
 * SettlementInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction4
 * SettlementInstruction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
 * SettlementDateTimeIndication1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction1
 * SettlementInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation2
 * SettlementInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation14
 * SettlementInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction2
 * SettlementInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation16
 * SettlementInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentSchemeChoice
 * PaymentSchemeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReturnInformation1
 * ReturnInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation15
 * SettlementInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResolutionInformation1
 * ResolutionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms1
 * SettlementTerms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms2
 * SettlementTerms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInstruction3
 * SettlementInstruction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation10
 * SettlementInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation6
 * SettlementInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation11
 * SettlementInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation12
 * SettlementInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation8
 * SettlementInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation9
 * SettlementInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTerms3
 * SettlementTerms3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
 * CashAccount.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
 * PaymentInstruction.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
 * TransactionAdministrator.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
 * Reservation.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
 * BookEntry.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmSettlementInformation
 * RequestedModification3.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmSettlementInformation
 * RequestedModification4.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmSettlementInformation
 * RequestedModification5.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmSettlementInformation
 * RequestedModification6.mmSettlementInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
 * CashSettlement.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
 * CashSettlement.mmInterbankSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmRTGS
 * CashSettlement.mmRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmCreditDateTime
 * CashSettlement.mmCreditDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedPaymentInstruction
 * CashSettlement.mmRelatedPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementMethod
 * CashSettlement.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
 * CashSettlement.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmDebitDateTime
 * CashSettlement.mmDebitDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
 * CashSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedTransactionAdministrator
 * CashSettlement.mmRelatedTransactionAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
 * CashSettlement.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRelatedInvestigationCase
 * CashSettlement.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
 * CashSettlement.mmReservation}</li>
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
 * "CashSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties."
 * </li>
 * </ul>
 */
public class CashSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount interbankSettlementAmount;
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInterbankSettlementAmount
	 * PaymentInstructionReference1Details.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmInterbankSettlementAmount
	 * PaymentInstructionReference2Details.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInterbankSettlementAmount
	 * PaymentInstructionReferenceDetails3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmInterbankSettlementAmount
	 * PaymentInstructionReferenceDetails4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmInterBankSettlementAmount
	 * LongPaymentIdentification1.mmInterBankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmInterbankSettlementAmount
	 * PaymentSearch2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInterbankSettlementAmount
	 * PaymentSearch3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementAmount
	 * PaymentSearch4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInterbankSettlementAmount
	 * PaymentDetails5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmInterbankSettlementAmount
	 * PaymentDetails6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmInterbankSettlementAmount
	 * PaymentDetails7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInterbankSettlementAmount
	 * PaymentInstruction1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmInterbankSettlementAmount
	 * OriginalTransactionReference1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation3.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmInterbankSettlementAmount
	 * OriginalTransactionReference13.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmInterbankSettlementAmount
	 * OriginalTransactionReference16.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmTotalInterbankSettlementAmount
	 * GroupHeader2.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmTotalInterbankSettlementAmount
	 * GroupHeader33.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation11.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmTotalInterbankSettlementAmount
	 * GroupHeader49.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInterbankSettlementAmount
	 * CreditTransferTransaction2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInterbankSettlementAmount
	 * CreditTransferTransaction7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmTotalInterbankSettlementAmount
	 * GroupHeader3.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmTotalInterbankSettlementAmount
	 * GroupHeader34.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation10.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmTotalInterbankSettlementAmount
	 * GroupHeader50.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation12.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation14.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation31.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction38.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction48.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader9.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation5.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation5.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader41.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation29.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation29.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader57.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction36.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmReversedInterbankSettlementAmount
	 * PaymentTransaction36.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction45.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversedInterbankSettlementAmount
	 * PaymentTransaction45.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmTotalInterbankSettlementAmount
	 * GroupHeader4.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmTotalInterbankSettlementAmount
	 * GroupHeader35.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation13.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmTotalInterbankSettlementAmount
	 * GroupHeader51.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmInterbankSettlementAmount
	 * CreditTransferTransaction4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmInterbankSettlementAmount
	 * CreditTransferTransaction8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader6.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation2.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation2.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader38.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation27.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation27.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader54.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction34.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction34.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction44.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction44.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmInterbankSettlementAmount
	 * OriginalTransactionReference15.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmInterbankSettlementAmount
	 * OriginalTransactionReference17.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInterbankSettledAmount
	 * RequestedModification.mmInterbankSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementAmount
	 * PaymentInstructionExtract2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#mmReturnedInterbankSettlementAmount
	 * ReturnInformation1.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInterbankSettlementAmount
	 * CorrectivePaymentInstructionExtract.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInterbankSettlementAmount
	 * RequestedModification2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation2.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmInterbankSettlementAmount
	 * ResolutionInformation1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation33.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInterbankSettlementAmount
	 * CorrectiveInterbankTransaction1.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction40.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInterbankSettlementAmount
	 * RequestedModification3.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation15.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmTotalInterbankSettlementAmount
	 * CreditTransferTransaction9.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation13.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation13.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation18.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation18.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmInterbankSettlementAmount
	 * OriginalTransactionReference9.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmInterbankSettlementAmount
	 * OriginalTransactionReference12.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmInterbankSettlementAmount
	 * OriginalTransactionReference8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmInterbankSettlementAmount
	 * OriginalTransactionReference11.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation14.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation14.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation20.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation20.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation16.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation16.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation23.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation23.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation17.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation17.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation24.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversedInterbankSettlementAmount
	 * PaymentTransactionInformation24.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalInterbankSettlementAmount
	 * PaymentTransactionInformation21.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmReturnedInterbankSettlementAmount
	 * PaymentTransactionInformation21.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInterbankSettlementAmount
	 * CreditTransferTransactionInformation9.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmTotalInterbankSettlementAmount
	 * GroupHeader19.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmTotalInterbankSettlementAmount
	 * GroupHeader24.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmTotalInterbankSettlementAmount
	 * GroupHeader20.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmTotalInterbankSettlementAmount
	 * GroupHeader25.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmTotalInterbankSettlementAmount
	 * GroupHeader15.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmTotalInterbankSettlementAmount
	 * GroupHeader26.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader17.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader27.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader22.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader28.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmTotalInterbankSettlementAmount
	 * GroupHeader16.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmTotalInterbankSettlementAmount
	 * GroupHeader29.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader18.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader30.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation7.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation8.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader21.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementAmount
	 * PaymentSearch5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInterbankSettlementAmount
	 * PaymentInstruction14.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction50.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction50.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmInterbankSettlementAmount
	 * CreditTransferTransaction17.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInterbankSettlementAmount
	 * CreditTransferTransaction19.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation17.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction51.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversedInterbankSettlementAmount
	 * PaymentTransaction51.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInterbankSettlementAmount
	 * RequestedModification4.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction53.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmInterbankSettlementAmount
	 * OriginalTransactionReference20.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction55.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmUpFrontPayment
	 * SecuritiesTransaction1.mmUpFrontPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInterbankSettlementAmount
	 * CreditTransferTransaction23.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmTotalInterbankSettlementAmount
	 * GroupHeader70.mmTotalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInterbankSettlementAmount
	 * RequestedModification5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInterbankSettlementAmount
	 * CreditTransferTransaction25.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmTotalReturnedInterbankSettlementAmount
	 * GroupHeader72.mmTotalReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction65.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction65.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation5.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation20.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction60.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversedInterbankSettlementAmount
	 * PaymentTransaction60.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmTotalReversedInterbankSettlementAmount
	 * GroupHeader71.mmTotalReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmInterbankSettlementAmount
	 * OriginalTransactionReference22.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction67.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction62.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInterbankSettlementAmount
	 * DirectDebitTransactionInformation21.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction81.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmReversedInterbankSettlementAmount
	 * PaymentTransaction81.mmReversedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInterbankSettlementAmount
	 * RequestedModification6.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction76.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmReturnedInterbankSettlementAmount
	 * PaymentTransaction76.mmReturnedInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmInterbankSettlementAmount
	 * OriginalTransactionReference24.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction75.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementAmount
	 * PaymentTransaction79.mmOriginalInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInterbankSettlementAmount
	 * PaymentComplementaryInformation6.mmInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterbankSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference1Details.mmInterbankSettlementAmount, PaymentInstructionReference2Details.mmInterbankSettlementAmount,
					PaymentInstructionReferenceDetails3.mmInterbankSettlementAmount, PaymentInstructionReferenceDetails4.mmInterbankSettlementAmount, LongPaymentIdentification1.mmInterBankSettlementAmount,
					PaymentSearch2.mmInterbankSettlementAmount, PaymentSearch3.mmInterbankSettlementAmount, PaymentSearch4.mmInterbankSettlementAmount, PaymentDetails5.mmInterbankSettlementAmount,
					PaymentDetails6.mmInterbankSettlementAmount, PaymentDetails7.mmInterbankSettlementAmount, PaymentInstruction1.mmInterbankSettlementAmount, OriginalTransactionReference1.mmInterbankSettlementAmount,
					PaymentTransactionInformation3.mmOriginalInterbankSettlementAmount, OriginalTransactionReference13.mmInterbankSettlementAmount, OriginalTransactionReference16.mmInterbankSettlementAmount,
					GroupHeader2.mmTotalInterbankSettlementAmount, CreditTransferTransactionInformation2.mmInterbankSettlementAmount, GroupHeader33.mmTotalInterbankSettlementAmount,
					CreditTransferTransactionInformation11.mmInterbankSettlementAmount, GroupHeader49.mmTotalInterbankSettlementAmount, CreditTransferTransaction2.mmInterbankSettlementAmount,
					CreditTransferTransaction7.mmInterbankSettlementAmount, GroupHeader3.mmTotalInterbankSettlementAmount, DirectDebitTransactionInformation2.mmInterbankSettlementAmount, GroupHeader34.mmTotalInterbankSettlementAmount,
					DirectDebitTransactionInformation10.mmInterbankSettlementAmount, GroupHeader50.mmTotalInterbankSettlementAmount, DirectDebitTransactionInformation12.mmInterbankSettlementAmount,
					DirectDebitTransactionInformation14.mmInterbankSettlementAmount, PaymentTransactionInformation31.mmOriginalInterbankSettlementAmount, PaymentTransaction38.mmOriginalInterbankSettlementAmount,
					PaymentTransaction48.mmOriginalInterbankSettlementAmount, GroupHeader9.mmTotalReversedInterbankSettlementAmount, PaymentTransactionInformation5.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation5.mmReversedInterbankSettlementAmount, GroupHeader41.mmTotalReversedInterbankSettlementAmount, PaymentTransactionInformation29.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation29.mmReversedInterbankSettlementAmount, GroupHeader57.mmTotalReversedInterbankSettlementAmount, PaymentTransaction36.mmOriginalInterbankSettlementAmount,
					PaymentTransaction36.mmReversedInterbankSettlementAmount, PaymentTransaction45.mmOriginalInterbankSettlementAmount, PaymentTransaction45.mmReversedInterbankSettlementAmount,
					GroupHeader4.mmTotalInterbankSettlementAmount, CreditTransferTransactionInformation3.mmInterbankSettlementAmount, GroupHeader35.mmTotalInterbankSettlementAmount,
					CreditTransferTransactionInformation13.mmInterbankSettlementAmount, GroupHeader51.mmTotalInterbankSettlementAmount, CreditTransferTransaction4.mmInterbankSettlementAmount,
					CreditTransferTransaction8.mmInterbankSettlementAmount, GroupHeader6.mmTotalReturnedInterbankSettlementAmount, PaymentTransactionInformation2.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation2.mmReturnedInterbankSettlementAmount, GroupHeader38.mmTotalReturnedInterbankSettlementAmount, PaymentTransactionInformation27.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation27.mmReturnedInterbankSettlementAmount, GroupHeader54.mmTotalReturnedInterbankSettlementAmount, PaymentTransaction34.mmOriginalInterbankSettlementAmount,
					PaymentTransaction34.mmReturnedInterbankSettlementAmount, PaymentTransaction44.mmOriginalInterbankSettlementAmount, PaymentTransaction44.mmReturnedInterbankSettlementAmount,
					OriginalTransactionReference15.mmInterbankSettlementAmount, OriginalTransactionReference17.mmInterbankSettlementAmount, RequestedModification.mmInterbankSettledAmount,
					PaymentInstructionExtract2.mmInterbankSettlementAmount, ReturnInformation1.mmReturnedInterbankSettlementAmount, CorrectivePaymentInstructionExtract.mmInterbankSettlementAmount,
					UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementAmount, RequestedModification2.mmInterbankSettlementAmount, PaymentComplementaryInformation2.mmInterbankSettlementAmount,
					ResolutionInformation1.mmInterbankSettlementAmount, PaymentTransactionInformation33.mmOriginalInterbankSettlementAmount, CorrectiveInterbankTransaction1.mmInterbankSettlementAmount,
					UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount, PaymentComplementaryInformation3.mmInterbankSettlementAmount, PaymentTransaction40.mmOriginalInterbankSettlementAmount,
					RequestedModification3.mmInterbankSettlementAmount, DirectDebitTransactionInformation15.mmInterbankSettlementAmount, CreditTransferTransaction9.mmTotalInterbankSettlementAmount,
					PaymentTransactionInformation13.mmOriginalInterbankSettlementAmount, PaymentTransactionInformation13.mmReturnedInterbankSettlementAmount, PaymentTransactionInformation18.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation18.mmReturnedInterbankSettlementAmount, OriginalTransactionReference9.mmInterbankSettlementAmount, OriginalTransactionReference12.mmInterbankSettlementAmount,
					OriginalTransactionReference8.mmInterbankSettlementAmount, OriginalTransactionReference11.mmInterbankSettlementAmount, PaymentTransactionInformation14.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation14.mmReversedInterbankSettlementAmount, PaymentTransactionInformation20.mmOriginalInterbankSettlementAmount, PaymentTransactionInformation20.mmReversedInterbankSettlementAmount,
					PaymentTransactionInformation16.mmOriginalInterbankSettlementAmount, PaymentTransactionInformation16.mmReturnedInterbankSettlementAmount, PaymentTransactionInformation23.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation23.mmReturnedInterbankSettlementAmount, PaymentTransactionInformation17.mmOriginalInterbankSettlementAmount, PaymentTransactionInformation17.mmReversedInterbankSettlementAmount,
					PaymentTransactionInformation24.mmOriginalInterbankSettlementAmount, PaymentTransactionInformation24.mmReversedInterbankSettlementAmount, PaymentTransactionInformation21.mmOriginalInterbankSettlementAmount,
					PaymentTransactionInformation21.mmReturnedInterbankSettlementAmount, CreditTransferTransactionInformation6.mmInterbankSettlementAmount, CreditTransferTransactionInformation8.mmInterbankSettlementAmount,
					CreditTransferTransactionInformation7.mmInterbankSettlementAmount, CreditTransferTransactionInformation9.mmInterbankSettlementAmount, GroupHeader19.mmTotalInterbankSettlementAmount,
					GroupHeader24.mmTotalInterbankSettlementAmount, GroupHeader20.mmTotalInterbankSettlementAmount, GroupHeader25.mmTotalInterbankSettlementAmount, GroupHeader15.mmTotalInterbankSettlementAmount,
					GroupHeader26.mmTotalInterbankSettlementAmount, GroupHeader17.mmTotalReturnedInterbankSettlementAmount, GroupHeader27.mmTotalReturnedInterbankSettlementAmount, GroupHeader22.mmTotalReversedInterbankSettlementAmount,
					GroupHeader28.mmTotalReversedInterbankSettlementAmount, GroupHeader16.mmTotalInterbankSettlementAmount, GroupHeader29.mmTotalInterbankSettlementAmount, GroupHeader18.mmTotalReversedInterbankSettlementAmount,
					GroupHeader30.mmTotalReversedInterbankSettlementAmount, DirectDebitTransactionInformation5.mmInterbankSettlementAmount, DirectDebitTransactionInformation7.mmInterbankSettlementAmount,
					DirectDebitTransactionInformation6.mmInterbankSettlementAmount, DirectDebitTransactionInformation8.mmInterbankSettlementAmount, GroupHeader21.mmTotalReturnedInterbankSettlementAmount,
					PaymentSearch5.mmInterbankSettlementAmount, PaymentInstruction14.mmInterbankSettlementAmount, PaymentComplementaryInformation4.mmInterbankSettlementAmount, PaymentTransaction50.mmOriginalInterbankSettlementAmount,
					PaymentTransaction50.mmReturnedInterbankSettlementAmount, CreditTransferTransaction17.mmInterbankSettlementAmount, CreditTransferTransaction19.mmInterbankSettlementAmount,
					DirectDebitTransactionInformation17.mmInterbankSettlementAmount, PaymentTransaction51.mmOriginalInterbankSettlementAmount, PaymentTransaction51.mmReversedInterbankSettlementAmount,
					RequestedModification4.mmInterbankSettlementAmount, PaymentTransaction53.mmOriginalInterbankSettlementAmount, OriginalTransactionReference20.mmInterbankSettlementAmount,
					PaymentTransaction55.mmOriginalInterbankSettlementAmount, SecuritiesTransaction1.mmUpFrontPayment, CreditTransferTransaction23.mmInterbankSettlementAmount, GroupHeader70.mmTotalInterbankSettlementAmount,
					RequestedModification5.mmInterbankSettlementAmount, CreditTransferTransaction25.mmInterbankSettlementAmount, GroupHeader72.mmTotalReturnedInterbankSettlementAmount,
					PaymentTransaction65.mmOriginalInterbankSettlementAmount, PaymentTransaction65.mmReturnedInterbankSettlementAmount, PaymentComplementaryInformation5.mmInterbankSettlementAmount,
					DirectDebitTransactionInformation20.mmInterbankSettlementAmount, PaymentTransaction60.mmOriginalInterbankSettlementAmount, PaymentTransaction60.mmReversedInterbankSettlementAmount,
					GroupHeader71.mmTotalReversedInterbankSettlementAmount, OriginalTransactionReference22.mmInterbankSettlementAmount, PaymentTransaction67.mmOriginalInterbankSettlementAmount,
					PaymentTransaction62.mmOriginalInterbankSettlementAmount, DirectDebitTransactionInformation21.mmInterbankSettlementAmount, PaymentTransaction81.mmOriginalInterbankSettlementAmount,
					PaymentTransaction81.mmReversedInterbankSettlementAmount, RequestedModification6.mmInterbankSettlementAmount, PaymentTransaction76.mmOriginalInterbankSettlementAmount,
					PaymentTransaction76.mmReturnedInterbankSettlementAmount, OriginalTransactionReference24.mmInterbankSettlementAmount, PaymentTransaction75.mmOriginalInterbankSettlementAmount,
					PaymentTransaction79.mmOriginalInterbankSettlementAmount, PaymentComplementaryInformation6.mmInterbankSettlementAmount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODateTime interbankSettlementDate;
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInterbankValueDate
	 * PaymentInstructionReference1Details.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmInterbankValueDate
	 * PaymentInstructionReference2Details.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInterbankValueDate
	 * PaymentInstructionReferenceDetails3.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmInterbankValueDate
	 * PaymentInstructionReferenceDetails4.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmInterBankSettlementDate
	 * LongPaymentIdentification1.mmInterBankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmInterBankSettlementDate
	 * ShortPaymentIdentification1.mmInterBankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementDate
	 * PaymentSearch4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInterbankValueDate
	 * PaymentDetails5.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmInterbankValueDate
	 * PaymentDetails6.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmInterbankValueDate
	 * PaymentDetails7.mmInterbankValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInterbankSettlementDate
	 * PaymentInstruction1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmInterbankSettlementDate
	 * TransactionDates1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmInterbankSettlementDate
	 * TransactionDates2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmInterbankSettlementDate
	 * OriginalTransactionReference1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmInterbankSettlementDate
	 * OriginalTransactionReference13.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmInterbankSettlementDate
	 * OriginalTransactionReference16.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmInterbankSettlementDate
	 * GroupHeader2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmInterbankSettlementDate
	 * GroupHeader33.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation11.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmInterbankSettlementDate
	 * GroupHeader49.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInterbankSettlementDate
	 * CreditTransferTransaction2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInterbankSettlementDate
	 * CreditTransferTransaction7.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmInterbankSettlementDate
	 * GroupHeader3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmInterbankSettlementDate
	 * GroupHeader34.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation10.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmInterbankSettlementDate
	 * GroupHeader50.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation12.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation14.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalInterbankSettlementDate
	 * PaymentTransaction38.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalInterbankSettlementDate
	 * PaymentTransaction48.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmInterbankSettlementDate
	 * GroupHeader9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmInterbankSettlementDate
	 * PaymentTransactionInformation5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmInterbankSettlementDate
	 * GroupHeader41.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmInterbankSettlementDate
	 * PaymentTransactionInformation29.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmInterbankSettlementDate
	 * GroupHeader57.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmInterbankSettlementDate
	 * PaymentTransaction36.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmInterbankSettlementDate
	 * PaymentTransaction45.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmInterbankSettlementDate
	 * GroupHeader4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmInterbankSettlementDate
	 * GroupHeader35.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation13.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmInterbankSettlementDate
	 * GroupHeader51.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmInterbankSettlementDate
	 * CreditTransferTransaction4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmInterbankSettlementDate
	 * CreditTransferTransaction8.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmInterbankSettlementDate
	 * GroupHeader6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmInterbankSettlementDate
	 * PaymentTransactionInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmInterbankSettlementDate
	 * GroupHeader38.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmInterbankSettlementDate
	 * PaymentTransactionInformation27.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmInterbankSettlementDate
	 * GroupHeader54.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmInterbankSettlementDate
	 * PaymentTransaction34.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmInterbankSettlementDate
	 * PaymentTransaction44.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmInterbankSettlementDate
	 * OriginalTransactionReference15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmInterbankSettlementDate
	 * OriginalTransactionReference17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast2#mmSettlementDate
	 * CashInForecast2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast2#mmSettlementDate
	 * CashOutForecast2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast4#mmCashSettlementDate
	 * CashInForecast4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#mmCashSettlementDate
	 * CashOutForecast4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast1#mmSettlementDate
	 * CashInForecast1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast1#mmSettlementDate
	 * CashOutForecast1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast3#mmCashSettlementDate
	 * CashInForecast3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast3#mmCashSettlementDate
	 * CashOutForecast3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementDate
	 * PaymentInstructionExtract2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnInformation1#mmInterbankSettlementDate
	 * ReturnInformation1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInterbankSettlementDate
	 * CorrectivePaymentInstructionExtract.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInterbankSettlementDate
	 * RequestedModification2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInterbankSettlementDate
	 * PaymentComplementaryInformation2.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ResolutionInformation1#mmInterbankSettlementDate
	 * ResolutionInformation1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalInterbankSettlementDate
	 * PaymentTransactionInformation33.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInterbankSettlementDate
	 * CorrectiveInterbankTransaction1.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInterbankSettlementDate
	 * PaymentComplementaryInformation3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalInterbankSettlementDate
	 * PaymentTransaction40.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInterbankSettlementDate
	 * RequestedModification3.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInterbankSettlementDate
	 * CreditTransferTransaction9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmInterbankSettlementDate
	 * OriginalTransactionReference7.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmInterbankSettlementDate
	 * OriginalTransactionReference10.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmInterbankSettlementDate
	 * OriginalTransactionReference9.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmInterbankSettlementDate
	 * OriginalTransactionReference12.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmInterbankSettlementDate
	 * OriginalTransactionReference8.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmInterbankSettlementDate
	 * OriginalTransactionReference11.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmInterbankSettlementDate
	 * PaymentTransactionInformation16.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmInterbankSettlementDate
	 * PaymentTransactionInformation17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmInterbankSettlementDate
	 * PaymentTransactionInformation21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInterbankSettlementDate
	 * CreditTransferTransactionInformation7.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmInterbankSettlementDate
	 * GroupHeader19.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmInterbankSettlementDate
	 * GroupHeader24.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmInterbankSettlementDate
	 * GroupHeader20.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmInterbankSettlementDate
	 * GroupHeader25.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmInterbankSettlementDate
	 * GroupHeader15.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmInterbankSettlementDate
	 * GroupHeader26.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmInterbankSettlementDate
	 * GroupHeader17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmInterbankSettlementDate
	 * GroupHeader27.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmInterbankSettlementDate
	 * GroupHeader22.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmInterbankSettlementDate
	 * GroupHeader28.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmInterbankSettlementDate
	 * GroupHeader16.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmInterbankSettlementDate
	 * GroupHeader29.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmInterbankSettlementDate
	 * GroupHeader18.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmInterbankSettlementDate
	 * GroupHeader30.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmInterbankSettlementDate
	 * GroupHeader21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettlementDate
	 * IntraBalance2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance1#mmSettlementDate
	 * IntraBalance1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementDate
	 * PaymentSearch5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInterbankSettlementDate
	 * PaymentInstruction14.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashSettlementDate
	 * CashOutForecast5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast5#mmCashSettlementDate
	 * CashInForecast5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#mmCashSettlementDate
	 * CashOutForecast6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInForecast6#mmCashSettlementDate
	 * CashInForecast6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInterbankSettlementDate
	 * PaymentComplementaryInformation4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmInterbankSettlementDate
	 * PaymentTransaction50.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmInterbankSettlementDate
	 * CreditTransferTransaction17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInterbankSettlementDate
	 * CreditTransferTransaction19.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation17.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmInterbankSettlementDate
	 * PaymentTransaction51.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInterbankSettlementDate
	 * RequestedModification4.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalInterbankSettlementDate
	 * PaymentTransaction53.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmInterbankSettlementDate
	 * OriginalTransactionReference20.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalInterbankSettlementDate
	 * PaymentTransaction55.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashInOutForecast7#mmCashSettlementDate
	 * CashInOutForecast7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInterbankSettlementDate
	 * CreditTransferTransaction23.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmInterbankSettlementDate
	 * GroupHeader70.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInterbankSettlementDate
	 * RequestedModification5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInterbankSettlementDate
	 * CreditTransferTransaction25.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmInterbankSettlementDate
	 * GroupHeader72.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmInterbankSettlementDate
	 * PaymentTransaction65.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInterbankSettlementDate
	 * PaymentComplementaryInformation5.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation20.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmInterbankSettlementDate
	 * PaymentTransaction60.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmInterbankSettlementDate
	 * GroupHeader71.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmInterbankSettlementDate
	 * OriginalTransactionReference22.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalInterbankSettlementDate
	 * PaymentTransaction67.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalInterbankSettlementDate
	 * PaymentTransaction62.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInterbankSettlementDate
	 * DirectDebitTransactionInformation21.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmInterbankSettlementDate
	 * PaymentTransaction81.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInterbankSettlementDate
	 * RequestedModification6.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmInterbankSettlementDate
	 * PaymentTransaction76.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmInterbankSettlementDate
	 * OriginalTransactionReference24.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInterbankSettlementDate
	 * PaymentTransaction75.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInterbankSettlementDate
	 * PaymentTransaction79.mmOriginalInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInterbankSettlementDate
	 * PaymentComplementaryInformation6.mmInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterbankSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference1Details.mmInterbankValueDate, PaymentInstructionReference2Details.mmInterbankValueDate, PaymentInstructionReferenceDetails3.mmInterbankValueDate,
					PaymentInstructionReferenceDetails4.mmInterbankValueDate, LongPaymentIdentification1.mmInterBankSettlementDate, ShortPaymentIdentification1.mmInterBankSettlementDate, PaymentSearch4.mmInterbankSettlementDate,
					PaymentDetails5.mmInterbankValueDate, PaymentDetails6.mmInterbankValueDate, PaymentDetails7.mmInterbankValueDate, PaymentInstruction1.mmInterbankSettlementDate, TransactionDates1.mmInterbankSettlementDate,
					TransactionDates2.mmInterbankSettlementDate, OriginalTransactionReference1.mmInterbankSettlementDate, OriginalTransactionReference13.mmInterbankSettlementDate, OriginalTransactionReference16.mmInterbankSettlementDate,
					GroupHeader2.mmInterbankSettlementDate, CreditTransferTransactionInformation2.mmInterbankSettlementDate, GroupHeader33.mmInterbankSettlementDate, CreditTransferTransactionInformation11.mmInterbankSettlementDate,
					GroupHeader49.mmInterbankSettlementDate, CreditTransferTransaction2.mmInterbankSettlementDate, CreditTransferTransaction7.mmInterbankSettlementDate, GroupHeader3.mmInterbankSettlementDate,
					DirectDebitTransactionInformation2.mmInterbankSettlementDate, GroupHeader34.mmInterbankSettlementDate, DirectDebitTransactionInformation10.mmInterbankSettlementDate, GroupHeader50.mmInterbankSettlementDate,
					DirectDebitTransactionInformation12.mmInterbankSettlementDate, DirectDebitTransactionInformation14.mmInterbankSettlementDate, PaymentTransaction38.mmOriginalInterbankSettlementDate,
					PaymentTransaction48.mmOriginalInterbankSettlementDate, GroupHeader9.mmInterbankSettlementDate, PaymentTransactionInformation5.mmInterbankSettlementDate, GroupHeader41.mmInterbankSettlementDate,
					PaymentTransactionInformation29.mmInterbankSettlementDate, GroupHeader57.mmInterbankSettlementDate, PaymentTransaction36.mmInterbankSettlementDate, PaymentTransaction45.mmInterbankSettlementDate,
					GroupHeader4.mmInterbankSettlementDate, CreditTransferTransactionInformation3.mmInterbankSettlementDate, GroupHeader35.mmInterbankSettlementDate, CreditTransferTransactionInformation13.mmInterbankSettlementDate,
					GroupHeader51.mmInterbankSettlementDate, CreditTransferTransaction4.mmInterbankSettlementDate, CreditTransferTransaction8.mmInterbankSettlementDate, GroupHeader6.mmInterbankSettlementDate,
					PaymentTransactionInformation2.mmInterbankSettlementDate, GroupHeader38.mmInterbankSettlementDate, PaymentTransactionInformation27.mmInterbankSettlementDate, GroupHeader54.mmInterbankSettlementDate,
					PaymentTransaction34.mmInterbankSettlementDate, PaymentTransaction44.mmInterbankSettlementDate, OriginalTransactionReference15.mmInterbankSettlementDate, OriginalTransactionReference17.mmInterbankSettlementDate,
					CashInForecast2.mmSettlementDate, CashOutForecast2.mmSettlementDate, CashInForecast4.mmCashSettlementDate, CashOutForecast4.mmCashSettlementDate, CashInForecast1.mmSettlementDate, CashOutForecast1.mmSettlementDate,
					CashInForecast3.mmCashSettlementDate, CashOutForecast3.mmCashSettlementDate, PaymentInstructionExtract2.mmInterbankSettlementDate, ReturnInformation1.mmInterbankSettlementDate,
					CorrectivePaymentInstructionExtract.mmInterbankSettlementDate, UnderlyingPaymentTransaction1.mmOriginalInterbankSettlementDate, RequestedModification2.mmInterbankSettlementDate,
					PaymentComplementaryInformation2.mmInterbankSettlementDate, ResolutionInformation1.mmInterbankSettlementDate, PaymentTransactionInformation33.mmOriginalInterbankSettlementDate,
					CorrectiveInterbankTransaction1.mmInterbankSettlementDate, UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate, PaymentComplementaryInformation3.mmInterbankSettlementDate,
					PaymentTransaction40.mmOriginalInterbankSettlementDate, RequestedModification3.mmInterbankSettlementDate, DirectDebitTransactionInformation15.mmInterbankSettlementDate,
					CreditTransferTransaction9.mmInterbankSettlementDate, OriginalTransactionReference7.mmInterbankSettlementDate, OriginalTransactionReference10.mmInterbankSettlementDate,
					OriginalTransactionReference9.mmInterbankSettlementDate, OriginalTransactionReference12.mmInterbankSettlementDate, OriginalTransactionReference8.mmInterbankSettlementDate,
					OriginalTransactionReference11.mmInterbankSettlementDate, PaymentTransactionInformation16.mmInterbankSettlementDate, PaymentTransactionInformation17.mmInterbankSettlementDate,
					PaymentTransactionInformation21.mmInterbankSettlementDate, CreditTransferTransactionInformation7.mmInterbankSettlementDate, GroupHeader19.mmInterbankSettlementDate, GroupHeader24.mmInterbankSettlementDate,
					GroupHeader20.mmInterbankSettlementDate, GroupHeader25.mmInterbankSettlementDate, GroupHeader15.mmInterbankSettlementDate, GroupHeader26.mmInterbankSettlementDate, GroupHeader17.mmInterbankSettlementDate,
					GroupHeader27.mmInterbankSettlementDate, GroupHeader22.mmInterbankSettlementDate, GroupHeader28.mmInterbankSettlementDate, GroupHeader16.mmInterbankSettlementDate, GroupHeader29.mmInterbankSettlementDate,
					GroupHeader18.mmInterbankSettlementDate, GroupHeader30.mmInterbankSettlementDate, DirectDebitTransactionInformation6.mmInterbankSettlementDate, GroupHeader21.mmInterbankSettlementDate, IntraBalance2.mmSettlementDate,
					IntraBalance1.mmSettlementDate, PaymentSearch5.mmInterbankSettlementDate, PaymentInstruction14.mmInterbankSettlementDate, CashOutForecast5.mmCashSettlementDate, CashInForecast5.mmCashSettlementDate,
					CashOutForecast6.mmCashSettlementDate, CashInForecast6.mmCashSettlementDate, PaymentComplementaryInformation4.mmInterbankSettlementDate, PaymentTransaction50.mmInterbankSettlementDate,
					CreditTransferTransaction17.mmInterbankSettlementDate, CreditTransferTransaction19.mmInterbankSettlementDate, DirectDebitTransactionInformation17.mmInterbankSettlementDate,
					PaymentTransaction51.mmInterbankSettlementDate, RequestedModification4.mmInterbankSettlementDate, PaymentTransaction53.mmOriginalInterbankSettlementDate, OriginalTransactionReference20.mmInterbankSettlementDate,
					PaymentTransaction55.mmOriginalInterbankSettlementDate, CashInOutForecast7.mmCashSettlementDate, CreditTransferTransaction23.mmInterbankSettlementDate, GroupHeader70.mmInterbankSettlementDate,
					RequestedModification5.mmInterbankSettlementDate, CreditTransferTransaction25.mmInterbankSettlementDate, GroupHeader72.mmInterbankSettlementDate, PaymentTransaction65.mmInterbankSettlementDate,
					PaymentComplementaryInformation5.mmInterbankSettlementDate, DirectDebitTransactionInformation20.mmInterbankSettlementDate, PaymentTransaction60.mmInterbankSettlementDate, GroupHeader71.mmInterbankSettlementDate,
					OriginalTransactionReference22.mmInterbankSettlementDate, PaymentTransaction67.mmOriginalInterbankSettlementDate, PaymentTransaction62.mmOriginalInterbankSettlementDate,
					DirectDebitTransactionInformation21.mmInterbankSettlementDate, PaymentTransaction81.mmInterbankSettlementDate, RequestedModification6.mmInterbankSettlementDate, PaymentTransaction76.mmInterbankSettlementDate,
					OriginalTransactionReference24.mmInterbankSettlementDate, PaymentTransaction75.mmOriginalInterbankSettlementDate, PaymentTransaction79.mmOriginalInterbankSettlementDate,
					PaymentComplementaryInformation6.mmInterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max4AlphaNumericText rTGS;
	/**
	 * Qualifies the RTGS status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmRTGS
	 * PaymentStatusCode5Choice.mmRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmRTGS
	 * PaymentStatusCode6Choice.mmRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the RTGS status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRTGS = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentStatusCode5Choice.mmRTGS, PaymentStatusCode6Choice.mmRTGS);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected ISODateTime creditDateTime;
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the credit side.
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#mmCreditDateTime
	 * SettlementDateTimeIndication1.mmCreditDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInterbankSettlementDate
	 * PaymentTransactionInformation31.mmOriginalInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the credit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDateTimeIndication1.mmCreditDateTime, PaymentTransactionInformation31.mmOriginalInterbankSettlementDate);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PaymentInstruction relatedPaymentInstruction;
	/**
	 * PaymentInstruction which is the source of the settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PaymentInstruction which is the source of the settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected SettlementMethodCode settlementMethod;
	/**
	 * Method used to settle the (batch of) payment instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmSettlementMethod
	 * SettlementInformation3.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#mmSettlementMethod
	 * SettlementInformation1.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmSettlementMethod
	 * SettlementInformation13.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmSettlementMethod
	 * SettlementInstruction4.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#mmSettlementMethod
	 * SettlementInstruction1.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#mmSettlementMethod
	 * SettlementInformation2.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#mmSettlementMethod
	 * SettlementInformation14.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmSettlementMethod
	 * SettlementInstruction2.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#mmSettlementMethod
	 * SettlementInformation16.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#mmSettlementMethod
	 * SettlementInformation10.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmSettlementMethod
	 * SettlementInformation6.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#mmSettlementMethod
	 * SettlementInformation11.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#mmSettlementMethod
	 * SettlementInformation12.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#mmSettlementMethod
	 * SettlementInformation8.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmSettlementMethod
	 * SettlementInformation9.mmSettlementMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementInformation3.mmSettlementMethod, SettlementInformation1.mmSettlementMethod, SettlementInformation13.mmSettlementMethod, SettlementInstruction4.mmSettlementMethod,
					SettlementInstruction1.mmSettlementMethod, SettlementInformation2.mmSettlementMethod, SettlementInformation14.mmSettlementMethod, SettlementInstruction2.mmSettlementMethod, SettlementInformation16.mmSettlementMethod,
					SettlementInformation10.mmSettlementMethod, SettlementInformation6.mmSettlementMethod, SettlementInformation11.mmSettlementMethod, SettlementInformation12.mmSettlementMethod, SettlementInformation8.mmSettlementMethod,
					SettlementInformation9.mmSettlementMethod);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}
	};
	protected CashAccount settlementAccount;
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
	 * CashAccount.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmSettlementDetails
	 * LocalMarketAnnex2.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmSettlementAccount
	 * SettlementInformation3.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#mmSettlementAccount
	 * SettlementInformation1.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmSettlementAccount
	 * SettlementInformation13.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmSettlementAccount
	 * SettlementInstruction4.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#mmSettlementAccount
	 * SettlementInstruction1.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation2#mmSettlementAccount
	 * SettlementInformation2.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation14#mmSettlementAccount
	 * SettlementInformation14.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmSettlementAccount
	 * SettlementInstruction2.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Demand1#mmSettlementAccount
	 * Demand1.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#mmSettlementAccount
	 * SettlementInformation16.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmNostroVostroAccount
	 * PaymentComplementaryInformation.mmNostroVostroAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInformation15#mmPaymentAccount
	 * PaymentInformation15.mmPaymentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation10#mmSettlementAccount
	 * SettlementInformation10.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmSettlementAccount
	 * SettlementInformation6.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11#mmSettlementAccount
	 * SettlementInformation11.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation12#mmSettlementAccount
	 * SettlementInformation12.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#mmSettlementAccount
	 * SettlementInformation8.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation9#mmSettlementAccount
	 * SettlementInformation9.mmSettlementAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LocalMarketAnnex2.mmSettlementDetails, SettlementInformation3.mmSettlementAccount, SettlementInformation1.mmSettlementAccount, SettlementInformation13.mmSettlementAccount,
					SettlementInstruction4.mmSettlementAccount, SettlementInstruction1.mmSettlementAccount, SettlementInformation2.mmSettlementAccount, SettlementInformation14.mmSettlementAccount,
					SettlementInstruction2.mmSettlementAccount, Demand1.mmSettlementAccount, SettlementInformation16.mmSettlementAccount, PaymentComplementaryInformation.mmNostroVostroAccount, PaymentInformation15.mmPaymentAccount,
					SettlementInformation10.mmSettlementAccount, SettlementInformation6.mmSettlementAccount, SettlementInformation11.mmSettlementAccount, SettlementInformation12.mmSettlementAccount,
					SettlementInformation8.mmSettlementAccount, SettlementInformation9.mmSettlementAccount);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected ISODateTime debitDateTime;
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the debit side.
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1#mmDebitDateTime
	 * SettlementDateTimeIndication1.mmDebitDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the occurred settlement time(s) of the payment transaction for the debit side."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDebitDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDateTimeIndication1.mmDebitDateTime);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashSettlementInstructionPartyRole> partyRole;
	/**
	 * Specifies each role linked to the settlement of a payment and played by a
	 * party at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmSettlementInstruction
	 * CashSettlementInstructionPartyRole.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#mmCSDOrNCB
	 * BillingReport1.mmCSDOrNCB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmCSDOrNCB
	 * BillingSearchCriteria1.mmCSDOrNCB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BillingReport1.mmCSDOrNCB, BillingSearchCriteria1.mmCSDOrNCB);
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TransactionAdministrator> relatedTransactionAdministrator;
	/**
	 * Transaction administrator which manages the related settlement
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmSettlementInstruction
	 * TransactionAdministrator.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction administrator which manages the related settlement instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected BookEntry bookEntry;
	/**
	 * Movement of cash between two accounts in the same financial institution,
	 * resulting from the settlement of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
	 * BookEntry.mmRelatedSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBookEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCase;
	/**
	 * Case resolution which is the source of the correction of a settlement
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmCoverCorrection
	 * PaymentInvestigationCaseResolution.mmCoverCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case resolution which is the source of the correction of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected Reservation reservation;
	/**
	 * Liquidity set aside by the payer for specific purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
	 * Reservation.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReservation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashSettlement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.mmSettlementInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.mmSettlementInstruction,
						com.tools20022.repository.entity.TransactionAdministrator.mmSettlementInstruction, com.tools20022.repository.entity.Reservation.mmSettlementInstruction,
						com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmSettlementInstruction,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmCoverCorrection);
				derivationElement_lazy = () -> Arrays.asList(RequestedModification3.mmSettlementInformation, RequestedModification4.mmSettlementInformation, RequestedModification5.mmSettlementInformation,
						RequestedModification6.mmSettlementInformation);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(CashSettlement.mmInterbankSettlementAmount, CashSettlement.mmInterbankSettlementDate, CashSettlement.mmRTGS, CashSettlement.mmCreditDateTime, CashSettlement.mmRelatedPaymentInstruction,
						CashSettlement.mmSettlementMethod, CashSettlement.mmSettlementAccount, CashSettlement.mmDebitDateTime, CashSettlement.mmPartyRole, CashSettlement.mmRelatedTransactionAdministrator, CashSettlement.mmBookEntry,
						CashSettlement.mmRelatedInvestigationCase, CashSettlement.mmReservation);
				derivationComponent_lazy = () -> Arrays.asList(SettlementInformation3.mmObject(), SettlementInformation1.mmObject(), SettlementInformation13.mmObject(), SettlementInstruction4.mmObject(),
						SettlementDateTimeIndication1.mmObject(), SettlementInstruction1.mmObject(), SettlementInformation2.mmObject(), SettlementInformation14.mmObject(), SettlementInstruction2.mmObject(),
						SettlementInformation16.mmObject(), PaymentSchemeChoice.mmObject(), ReturnInformation1.mmObject(), SettlementInformation15.mmObject(), ResolutionInformation1.mmObject(), SettlementTerms1.mmObject(),
						SettlementTerms2.mmObject(), SettlementInstruction3.mmObject(), SettlementInformation10.mmObject(), SettlementInformation6.mmObject(), SettlementInformation11.mmObject(), SettlementInformation12.mmObject(),
						SettlementInformation8.mmObject(), SettlementInformation9.mmObject(), SettlementTerms3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(CurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	public ISODateTime getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public void setInterbankSettlementDate(ISODateTime interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
	}

	public Max4AlphaNumericText getRTGS() {
		return rTGS;
	}

	public void setRTGS(Max4AlphaNumericText rTGS) {
		this.rTGS = rTGS;
	}

	public ISODateTime getCreditDateTime() {
		return creditDateTime;
	}

	public void setCreditDateTime(ISODateTime creditDateTime) {
		this.creditDateTime = creditDateTime;
	}

	public PaymentInstruction getRelatedPaymentInstruction() {
		return relatedPaymentInstruction;
	}

	public void setRelatedPaymentInstruction(com.tools20022.repository.entity.PaymentInstruction relatedPaymentInstruction) {
		this.relatedPaymentInstruction = relatedPaymentInstruction;
	}

	public SettlementMethodCode getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(SettlementMethodCode settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public CashAccount getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(com.tools20022.repository.entity.CashAccount settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public ISODateTime getDebitDateTime() {
		return debitDateTime;
	}

	public void setDebitDateTime(ISODateTime debitDateTime) {
		this.debitDateTime = debitDateTime;
	}

	public List<CashSettlementInstructionPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.CashSettlementInstructionPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<TransactionAdministrator> getRelatedTransactionAdministrator() {
		return relatedTransactionAdministrator;
	}

	public void setRelatedTransactionAdministrator(List<com.tools20022.repository.entity.TransactionAdministrator> relatedTransactionAdministrator) {
		this.relatedTransactionAdministrator = relatedTransactionAdministrator;
	}

	public BookEntry getBookEntry() {
		return bookEntry;
	}

	public void setBookEntry(com.tools20022.repository.entity.BookEntry bookEntry) {
		this.bookEntry = bookEntry;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(com.tools20022.repository.entity.Reservation reservation) {
		this.reservation = reservation;
	}
}