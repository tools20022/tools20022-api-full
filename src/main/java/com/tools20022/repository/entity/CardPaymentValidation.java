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
import com.tools20022.repository.codeset.CardholderAddressVerificationResultCode;
import com.tools20022.repository.codeset.CSCResultCode;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.OnLineReasonCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Results and parameters of the card payment verification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentValidation"
 * src="doc-files/CardPaymentValidation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#TransactionSuccess
 * CardPaymentValidation.TransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#MerchantOverride
 * CardPaymentValidation.MerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#ValidityDate
 * CardPaymentValidation.ValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardPayment
 * CardPaymentValidation.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Response
 * CardPaymentValidation.Response}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#AuthorisationCode
 * CardPaymentValidation.AuthorisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#OnLineReason
 * CardPaymentValidation.OnLineReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Balance
 * CardPaymentValidation.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CardholderAddressVerificationResult
 * CardPaymentValidation.CardholderAddressVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#CSCResult
 * CardPaymentValidation.CSCResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#DeclinedProductCode
 * CardPaymentValidation.DeclinedProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#ElectronicCommerceAuthenticationResult
 * CardPaymentValidation.ElectronicCommerceAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#FailureReason
 * CardPaymentValidation.FailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Signature
 * CardPaymentValidation.Signature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedCardPaymentValidationProcess
 * CashBalance.RelatedCardPaymentValidationProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Signature#CardPaymentValidation
 * Signature.CardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
 * CardPaymentAcquiring.Validation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCategory#RelatedCardPaymentValidation
 * ProductCategory.RelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#RelatedCardPaymentValidation
 * Response.RelatedCardPaymentValidation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult1
 * AuthorisationResult1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult2
 * AuthorisationResult2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult3
 * AuthorisationResult3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult4
 * AuthorisationResult4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult5
 * AuthorisationResult5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult6
 * AuthorisationResult6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult8
 * AuthorisationResult8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult7
 * AuthorisationResult7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult9
 * AuthorisationResult9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult12
 * AuthorisationResult12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult11
 * AuthorisationResult11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult10
 * AuthorisationResult10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult13
 * AuthorisationResult13}</li>
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
 * "CardPaymentValidation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Results and parameters of the card payment verification."</li>
 * </ul>
 */
public class CardPaymentValidation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Outcome of the transaction at the acceptor.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#TransactionSuccess
	 * CardPaymentTransaction4.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#TransactionSuccess
	 * CardPaymentTransaction14.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#TransactionSuccess
	 * CardPaymentTransaction7.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#TransactionSuccess
	 * CardPaymentTransaction16.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#TransactionSuccess
	 * CardPaymentTransaction20.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#TransactionSuccess
	 * CardPaymentTransaction3.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#TransactionSuccess
	 * CardPaymentTransaction13.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#TransactionSuccess
	 * CardPaymentTransaction28.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#TransactionSuccess
	 * CardPaymentTransaction29.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#TransactionSuccess
	 * CardPaymentTransaction25.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#TransactionSuccess
	 * CardPaymentTransaction30.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#TransactionSuccess
	 * CardPaymentTransaction44.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#TransactionSuccess
	 * CardPaymentTransaction45.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#TransactionSuccess
	 * CardPaymentTransaction46.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#TransactionSuccess
	 * CardPaymentTransaction40.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#TransactionSuccess
	 * CardPaymentTransaction60.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#TransactionSuccess
	 * CardPaymentTransaction61.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#TransactionSuccess
	 * CardPaymentTransaction59.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#TransactionSuccess
	 * CardPaymentTransaction55.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#TransactionSuccess
	 * CardPaymentTransaction75.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#TransactionSuccess
	 * CardPaymentTransaction70.TransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#TransactionSuccess
	 * CardPaymentTransaction69.TransactionSuccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSuccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the transaction at the acceptor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransactionSuccess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction4.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction14.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction7.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction16.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction20.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction3.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction13.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction28.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction29.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction25.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction30.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction44.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction45.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction46.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction40.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction60.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction61.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction59.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction55.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction75.TransactionSuccess,
					com.tools20022.repository.msg.CardPaymentTransaction70.TransactionSuccess, com.tools20022.repository.msg.CardPaymentTransaction69.TransactionSuccess);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicate that the acceptor has forced the transaction in spite of the
	 * authorisation result (online or offline), or incident to complete the
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#MerchantOverride
	 * CardPaymentTransaction4.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#MerchantOverride
	 * CardPaymentTransaction14.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#MerchantOverride
	 * CardPaymentTransaction3.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#MerchantOverride
	 * CardPaymentTransaction13.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#MerchantOverride
	 * CardPaymentTransaction29.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#MerchantOverride
	 * CardPaymentTransaction25.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#MerchantOverride
	 * CardPaymentTransaction45.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#MerchantOverride
	 * CardPaymentTransaction40.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#MerchantOverride
	 * CardPaymentTransaction60.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#MerchantOverride
	 * CardPaymentTransaction55.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#MerchantOverride
	 * CardPaymentTransaction70.MerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#MerchantOverride
	 * CardPaymentTransaction69.MerchantOverride}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MerchantOverride = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction4.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction14.MerchantOverride,
					com.tools20022.repository.msg.CardPaymentTransaction3.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction13.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction29.MerchantOverride,
					com.tools20022.repository.msg.CardPaymentTransaction25.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction45.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction40.MerchantOverride,
					com.tools20022.repository.msg.CardPaymentTransaction60.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction55.MerchantOverride, com.tools20022.repository.msg.CardPaymentTransaction70.MerchantOverride,
					com.tools20022.repository.msg.CardPaymentTransaction69.MerchantOverride);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Transaction authorisation deadline to complete the related payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#ValidityDate
	 * CardPaymentTransactionDetails4.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#ValidityDate
	 * CardPaymentTransactionDetails7.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#ValidityDate
	 * CardPaymentTransactionDetails9.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#ValidityDate
	 * CardPaymentTransactionDetails1.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#ValidityDate
	 * CardPaymentTransactionDetails10.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#ValidityDate
	 * CardPaymentTransactionDetails2.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#ValidityDate
	 * CardPaymentTransactionDetails11.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#ValidityDate
	 * CardPaymentTransactionDetails5.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#ValidityDate
	 * CardPaymentTransactionDetails3.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#ValidityDate
	 * CardPaymentTransactionDetails12.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#ValidityDate
	 * CardPaymentTransactionDetails13.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#ValidityDate
	 * CardPaymentTransactionDetails16.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#ValidityDate
	 * CardPaymentTransactionDetails14.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#ValidityDate
	 * CardPaymentTransactionDetails15.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#ValidityDate
	 * CardPaymentTransactionDetails17.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#ValidityDate
	 * CardPaymentTransactionDetails20.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#ValidityDate
	 * CardPaymentTransactionDetails25.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#ValidityDate
	 * CardPaymentTransactionDetails23.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#ValidityDate
	 * CardPaymentTransactionDetails21.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#ValidityDate
	 * CardPaymentTransactionDetails19.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#ValidityDate
	 * CardPaymentTransactionDetails24.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#ValidityDate
	 * CardPaymentTransactionDetails32.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#ValidityDate
	 * CardPaymentTransactionDetails28.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#ValidityDate
	 * CardPaymentTransactionDetails29.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#ValidityDate
	 * CardPaymentTransactionDetails30.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#ValidityDate
	 * CardPaymentTransactionDetails27.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#ValidityDate
	 * CardPaymentTransactionDetails31.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#ValidityDate
	 * CardPaymentTransactionDetails34.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#ValidityDate
	 * CardPaymentTransactionDetails39.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#ValidityDate
	 * CardPaymentTransactionDetails38.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#ValidityDate
	 * CardPaymentTransactionDetails41.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#ValidityDate
	 * CardPaymentTransactionDetails37.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#ValidityDate
	 * CardPaymentTransactionDetails42.ValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#ValidityDate
	 * CardPaymentTransactionDetails43.ValidityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction authorisation deadline to complete the related payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValidityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails4.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails7.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails9.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails1.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails10.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails2.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails11.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails5.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails3.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails12.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails13.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails16.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails14.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails15.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails17.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails20.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails25.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails23.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails21.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails19.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails24.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails32.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails28.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails29.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails30.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails27.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails31.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails34.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails39.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails38.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails41.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails37.ValidityDate,
					com.tools20022.repository.msg.CardPaymentTransactionDetails42.ValidityDate, com.tools20022.repository.msg.CardPaymentTransactionDetails43.ValidityDate);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Card payment to which the validation process applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#Validation
	 * CardPaymentAcquiring.Validation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse2#TransactionIdentification
	 * CardPaymentTransactionAdviceResponse2.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1#TransactionIdentification
	 * CardPaymentTransactionAdviceResponse1.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#TransactionIdentification
	 * CardPaymentTransactionAdviceResponse3.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#TransactionIdentification
	 * CardPaymentTransactionAdviceResponse4.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5#TransactionIdentification
	 * CardPaymentTransactionAdviceResponse5.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#Action
	 * AuthorisationResult9.Action}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6#TransactionIdentification
	 * CardPaymentTransactionAdviceResponse6.TransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#Action
	 * AuthorisationResult13.Action}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment to which the validation process applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CardPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse2.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.TransactionIdentification, com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4.TransactionIdentification,
					com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5.TransactionIdentification, com.tools20022.repository.msg.AuthorisationResult9.Action,
					com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6.TransactionIdentification, com.tools20022.repository.msg.AuthorisationResult13.Action);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment to which the validation process applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Validation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Response to an authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Response#RelatedCardPaymentValidation
	 * Response.RelatedCardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Response Response}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#ResponseToAuthorisation
	 * AuthorisationResult1.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#ResponseToAuthorisation
	 * AuthorisationResult2.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#ResponseToAuthorisation
	 * AuthorisationResult3.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1#Transaction
	 * AcceptorCancellationAdviceResponse1.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2#Transaction
	 * AcceptorCancellationAdviceResponse2.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#Transaction
	 * AcceptorCompletionAdviceResponse1.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2#Transaction
	 * AcceptorCompletionAdviceResponse2.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1#TransactionResponse
	 * AcceptorReconciliationResponse1.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#TransactionResponse
	 * AcceptorReconciliationResponse2.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#Transaction
	 * AcceptorCancellationAdviceResponse3.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3#Transaction
	 * AcceptorCompletionAdviceResponse3.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#TransactionResponse
	 * AcceptorReconciliationResponse3.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#Transaction
	 * AcceptorCancellationAdviceResponse4.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4#Transaction
	 * AcceptorCompletionAdviceResponse4.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#ResponseToAuthorisation
	 * AuthorisationResult4.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#ResponseToAuthorisation
	 * AuthorisationResult5.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#ResponseToAuthorisation
	 * AuthorisationResult6.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#TransactionResponse
	 * AuthorisationResult8.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#TransactionResponse
	 * AuthorisationResult7.TransactionResponse}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction4#Response
	 * ATMTransaction4.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#AuthorisationResponse
	 * AuthorisationResult9.AuthorisationResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#ResponseTrace
	 * AuthorisationResult9.ResponseTrace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#TransactionResponse
	 * CardTransaction10.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#AuthorisationResult
	 * CardTransaction4.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#TransactionResponse
	 * CardTransaction9.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#TransactionResponse
	 * CardTransaction8.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#TransactionResponse
	 * CardTransaction7.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#TransactionVerificationResult
	 * CardTransactionDetail2.TransactionVerificationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#AuthorisationResult
	 * CardTransaction6.AuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#TransactionVerificationResult
	 * CardTransactionDetail4.TransactionVerificationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#Transaction
	 * AcceptorCancellationAdviceResponse5.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#TransactionResponse
	 * AcceptorReconciliationResponse4.TransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5#Transaction
	 * AcceptorCompletionAdviceResponse5.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#ResponseToAuthorisation
	 * AuthorisationResult12.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#ResponseToAuthorisation
	 * AuthorisationResult11.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#ResponseToAuthorisation
	 * AuthorisationResult10.ResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#AuthorisationResponse
	 * AuthorisationResult13.AuthorisationResponse}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction18#Response
	 * ATMTransaction18.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#Transaction
	 * AcceptorCancellationAdviceResponse6.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#Transaction
	 * AcceptorCompletionAdviceResponse6.Transaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to an authorisation request."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Response = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorisationResult1.ResponseToAuthorisation, com.tools20022.repository.msg.AuthorisationResult2.ResponseToAuthorisation,
					com.tools20022.repository.msg.AuthorisationResult3.ResponseToAuthorisation, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1.Transaction,
					com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.Transaction,
					com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2.Transaction, com.tools20022.repository.msg.AcceptorReconciliationResponse1.TransactionResponse,
					com.tools20022.repository.msg.AcceptorReconciliationResponse2.TransactionResponse, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3.Transaction,
					com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3.Transaction, com.tools20022.repository.msg.AcceptorReconciliationResponse3.TransactionResponse,
					com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.Transaction, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4.Transaction,
					com.tools20022.repository.msg.AuthorisationResult4.ResponseToAuthorisation, com.tools20022.repository.msg.AuthorisationResult5.ResponseToAuthorisation,
					com.tools20022.repository.msg.AuthorisationResult6.ResponseToAuthorisation, com.tools20022.repository.msg.AuthorisationResult8.TransactionResponse, com.tools20022.repository.msg.AuthorisationResult7.TransactionResponse,
					com.tools20022.repository.msg.ATMTransaction4.Response, com.tools20022.repository.msg.AuthorisationResult9.AuthorisationResponse, com.tools20022.repository.msg.AuthorisationResult9.ResponseTrace,
					com.tools20022.repository.msg.CardTransaction10.TransactionResponse, com.tools20022.repository.msg.CardTransaction4.AuthorisationResult, com.tools20022.repository.msg.CardTransaction9.TransactionResponse,
					com.tools20022.repository.msg.CardTransaction8.TransactionResponse, com.tools20022.repository.msg.CardTransaction7.TransactionResponse, com.tools20022.repository.msg.CardTransactionDetail2.TransactionVerificationResult,
					com.tools20022.repository.msg.CardTransaction6.AuthorisationResult, com.tools20022.repository.msg.CardTransactionDetail4.TransactionVerificationResult,
					com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5.Transaction, com.tools20022.repository.msg.AcceptorReconciliationResponse4.TransactionResponse,
					com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5.Transaction, com.tools20022.repository.msg.AuthorisationResult12.ResponseToAuthorisation,
					com.tools20022.repository.msg.AuthorisationResult11.ResponseToAuthorisation, com.tools20022.repository.msg.AuthorisationResult10.ResponseToAuthorisation,
					com.tools20022.repository.msg.AuthorisationResult13.AuthorisationResponse, com.tools20022.repository.msg.ATMTransaction18.Response, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.Transaction,
					com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6.Transaction);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Response";
			definition = "Response to an authorisation request.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Response.RelatedCardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value assigned by the authorising party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min6Max8Text Min6Max8Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#AuthorisationCode
	 * CardPaymentTransactionResult1.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#AuthorisationCode
	 * AuthorisationResult1.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#AuthorisationCode
	 * AuthorisationResult2.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#AuthorisationCode
	 * AuthorisationResult3.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#AuthorisationCode
	 * AuthorisationResult4.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#AuthorisationCode
	 * AuthorisationResult5.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#AuthorisationCode
	 * CardPaymentTransactionResult2.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#AuthorisationCode
	 * AuthorisationResult6.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#AuthorisationCode
	 * AuthorisationResult8.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#AuthorisationCode
	 * AuthorisationResult7.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#AuthorisationCode
	 * AuthorisationResult9.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult3#AuthorisationCode
	 * CardPaymentTransactionResult3.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#AuthorisationCode
	 * AuthorisationResult12.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#AuthorisationCode
	 * AuthorisationResult11.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#AuthorisationCode
	 * AuthorisationResult10.AuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#AuthorisationCode
	 * AuthorisationResult13.AuthorisationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value assigned by the authorising party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthorisationCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionResult1.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult1.AuthorisationCode,
					com.tools20022.repository.msg.AuthorisationResult2.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult3.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult4.AuthorisationCode,
					com.tools20022.repository.msg.AuthorisationResult5.AuthorisationCode, com.tools20022.repository.msg.CardPaymentTransactionResult2.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult6.AuthorisationCode,
					com.tools20022.repository.msg.AuthorisationResult8.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult7.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult9.AuthorisationCode,
					com.tools20022.repository.msg.CardPaymentTransactionResult3.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult12.AuthorisationCode,
					com.tools20022.repository.msg.AuthorisationResult11.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult10.AuthorisationCode, com.tools20022.repository.msg.AuthorisationResult13.AuthorisationCode);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}
	};
	/**
	 * Reason to process an online authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
	 * OnLineReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#OnLineReason
	 * CardPaymentTransactionDetails1.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#OnLineReason
	 * CardPaymentTransactionDetails10.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#OnLineReason
	 * CardPaymentTransactionDetails12.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#OnLineReason
	 * CardPaymentTransactionDetails16.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#OnLineReason
	 * CardPaymentTransactionDetails19.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#OnLineReason
	 * CardPaymentTransactionDetails24.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#OnLineReason
	 * CardPaymentTransactionDetails27.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#OnLineReason
	 * CardPaymentTransactionDetails31.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#OnLineReason
	 * CardPaymentTransactionDetails39.OnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#OnLineReason
	 * CardPaymentTransactionDetails41.OnLineReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to process an online authorisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OnLineReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails1.OnLineReason, com.tools20022.repository.msg.CardPaymentTransactionDetails10.OnLineReason,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.OnLineReason, com.tools20022.repository.msg.CardPaymentTransactionDetails16.OnLineReason,
					com.tools20022.repository.msg.CardPaymentTransactionDetails19.OnLineReason, com.tools20022.repository.msg.CardPaymentTransactionDetails24.OnLineReason,
					com.tools20022.repository.msg.CardPaymentTransactionDetails27.OnLineReason, com.tools20022.repository.msg.CardPaymentTransactionDetails31.OnLineReason,
					com.tools20022.repository.msg.CardPaymentTransactionDetails39.OnLineReason, com.tools20022.repository.msg.CardPaymentTransactionDetails41.OnLineReason);
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OnLineReasonCode.mmObject();
		}
	};
	/**
	 * Balance of the account attached to the payment card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedCardPaymentValidationProcess
	 * CashBalance.RelatedCardPaymentValidationProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account attached to the payment card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account attached to the payment card.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Result of the cardholder verification address checks on the street number
	 * and the postal code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderAddressVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the cardholder verification address checks on the street number and the postal code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CardholderAddressVerificationResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
		}
	};
	/**
	 * Result of the printed CSC (Card Security Code) validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResultCode
	 * CSCResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the printed CSC (Card Security Code) validation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CSCResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed CSC (Card Security Code) validation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CSCResultCode.mmObject();
		}
	};
	/**
	 * Product code for which the payment authorisation was declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#RelatedCardPaymentValidation
	 * ProductCategory.RelatedCardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclinedProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Product code for which the payment authorisation was declined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DeclinedProductCode = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the payment authorisation was declined.";
			minOccurs = 0;
			type_lazy = () -> ProductCategory.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Result of an e-commerce authentication process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerceAuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of an e-commerce authentication process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ElectronicCommerceAuthenticationResult = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	/**
	 * Incident occuring during the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incident occuring during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FailureReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "Incident occuring during the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}
	};
	/**
	 * Signature of the message to display or print.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#CardPaymentValidation
	 * Signature.CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Signature Signature}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signature of the message to display or print."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Signature = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CardPaymentValidation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Signature of the message to display or print.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.CardPaymentValidation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentValidation";
				definition = "Results and parameters of the card payment verification.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess, com.tools20022.repository.entity.Signature.CardPaymentValidation,
								com.tools20022.repository.entity.CardPaymentAcquiring.Validation, com.tools20022.repository.entity.ProductCategory.RelatedCardPaymentValidation,
								com.tools20022.repository.entity.Response.RelatedCardPaymentValidation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.TransactionSuccess, com.tools20022.repository.entity.CardPaymentValidation.MerchantOverride,
						com.tools20022.repository.entity.CardPaymentValidation.ValidityDate, com.tools20022.repository.entity.CardPaymentValidation.CardPayment, com.tools20022.repository.entity.CardPaymentValidation.Response,
						com.tools20022.repository.entity.CardPaymentValidation.AuthorisationCode, com.tools20022.repository.entity.CardPaymentValidation.OnLineReason, com.tools20022.repository.entity.CardPaymentValidation.Balance,
						com.tools20022.repository.entity.CardPaymentValidation.CardholderAddressVerificationResult, com.tools20022.repository.entity.CardPaymentValidation.CSCResult,
						com.tools20022.repository.entity.CardPaymentValidation.DeclinedProductCode, com.tools20022.repository.entity.CardPaymentValidation.ElectronicCommerceAuthenticationResult,
						com.tools20022.repository.entity.CardPaymentValidation.FailureReason, com.tools20022.repository.entity.CardPaymentValidation.Signature);
				derivationComponent_lazy = () -> Arrays.asList(AuthorisationResult1.mmObject(), AuthorisationResult2.mmObject(), AuthorisationResult3.mmObject(), AuthorisationResult4.mmObject(), AuthorisationResult5.mmObject(),
						AuthorisationResult6.mmObject(), AuthorisationResult8.mmObject(), AuthorisationResult7.mmObject(), AuthorisationResult9.mmObject(), AuthorisationResult12.mmObject(), AuthorisationResult11.mmObject(),
						AuthorisationResult10.mmObject(), AuthorisationResult13.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}