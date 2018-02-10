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
import com.tools20022.repository.codeset.CardholderAddressVerificationResultCode;
import com.tools20022.repository.codeset.CSCResultCode;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.OnLineReasonCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmTransactionSuccess
 * CardPaymentValidation.mmTransactionSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmMerchantOverride
 * CardPaymentValidation.mmMerchantOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmValidityDate
 * CardPaymentValidation.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
 * CardPaymentValidation.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
 * CardPaymentValidation.mmResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmAuthorisationCode
 * CardPaymentValidation.mmAuthorisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmOnLineReason
 * CardPaymentValidation.mmOnLineReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmBalance
 * CardPaymentValidation.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardholderAddressVerificationResult
 * CardPaymentValidation.mmCardholderAddressVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCSCResult
 * CardPaymentValidation.mmCSCResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmDeclinedProductCode
 * CardPaymentValidation.mmDeclinedProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmElectronicCommerceAuthenticationResult
 * CardPaymentValidation.mmElectronicCommerceAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmFailureReason
 * CardPaymentValidation.mmFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmSignature
 * CardPaymentValidation.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedCardPaymentValidationProcess
 * CashBalance.mmRelatedCardPaymentValidationProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Signature#mmCardPaymentValidation
 * Signature.mmCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
 * CardPaymentAcquiring.mmValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmRelatedCardPaymentValidation
 * ProductCategory.mmRelatedCardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Response#mmRelatedCardPaymentValidation
 * Response.mmRelatedCardPaymentValidation}</li>
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
	protected TrueFalseIndicator transactionSuccess;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmTransactionSuccess
	 * CardPaymentTransaction4.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmTransactionSuccess
	 * CardPaymentTransaction14.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmTransactionSuccess
	 * CardPaymentTransaction7.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmTransactionSuccess
	 * CardPaymentTransaction16.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmTransactionSuccess
	 * CardPaymentTransaction20.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmTransactionSuccess
	 * CardPaymentTransaction3.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmTransactionSuccess
	 * CardPaymentTransaction13.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmTransactionSuccess
	 * CardPaymentTransaction28.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmTransactionSuccess
	 * CardPaymentTransaction29.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmTransactionSuccess
	 * CardPaymentTransaction25.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmTransactionSuccess
	 * CardPaymentTransaction30.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmTransactionSuccess
	 * CardPaymentTransaction44.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmTransactionSuccess
	 * CardPaymentTransaction45.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmTransactionSuccess
	 * CardPaymentTransaction46.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmTransactionSuccess
	 * CardPaymentTransaction40.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmTransactionSuccess
	 * CardPaymentTransaction60.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmTransactionSuccess
	 * CardPaymentTransaction61.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmTransactionSuccess
	 * CardPaymentTransaction59.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmTransactionSuccess
	 * CardPaymentTransaction55.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmTransactionSuccess
	 * CardPaymentTransaction75.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmTransactionSuccess
	 * CardPaymentTransaction70.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmTransactionSuccess
	 * CardPaymentTransaction69.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmTransactionSuccess
	 * CardPaymentTransaction83.mmTransactionSuccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmTransactionSuccess
	 * CardPaymentTransaction81.mmTransactionSuccess}</li>
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
	public static final MMBusinessAttribute mmTransactionSuccess = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction4.mmTransactionSuccess, CardPaymentTransaction14.mmTransactionSuccess, CardPaymentTransaction7.mmTransactionSuccess, CardPaymentTransaction16.mmTransactionSuccess,
					CardPaymentTransaction20.mmTransactionSuccess, CardPaymentTransaction3.mmTransactionSuccess, CardPaymentTransaction13.mmTransactionSuccess, CardPaymentTransaction28.mmTransactionSuccess,
					CardPaymentTransaction29.mmTransactionSuccess, CardPaymentTransaction25.mmTransactionSuccess, CardPaymentTransaction30.mmTransactionSuccess, CardPaymentTransaction44.mmTransactionSuccess,
					CardPaymentTransaction45.mmTransactionSuccess, CardPaymentTransaction46.mmTransactionSuccess, CardPaymentTransaction40.mmTransactionSuccess, CardPaymentTransaction60.mmTransactionSuccess,
					CardPaymentTransaction61.mmTransactionSuccess, CardPaymentTransaction59.mmTransactionSuccess, CardPaymentTransaction55.mmTransactionSuccess, CardPaymentTransaction75.mmTransactionSuccess,
					CardPaymentTransaction70.mmTransactionSuccess, CardPaymentTransaction69.mmTransactionSuccess, CardPaymentTransaction83.mmTransactionSuccess, CardPaymentTransaction81.mmTransactionSuccess);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionSuccess";
			definition = "Outcome of the transaction at the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getTransactionSuccess", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator merchantOverride;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmMerchantOverride
	 * CardPaymentTransaction4.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmMerchantOverride
	 * CardPaymentTransaction14.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmMerchantOverride
	 * CardPaymentTransaction3.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmMerchantOverride
	 * CardPaymentTransaction13.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmMerchantOverride
	 * CardPaymentTransaction29.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmMerchantOverride
	 * CardPaymentTransaction25.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmMerchantOverride
	 * CardPaymentTransaction45.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmMerchantOverride
	 * CardPaymentTransaction40.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmMerchantOverride
	 * CardPaymentTransaction60.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmMerchantOverride
	 * CardPaymentTransaction55.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmMerchantOverride
	 * CardPaymentTransaction70.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmMerchantOverride
	 * CardPaymentTransaction69.mmMerchantOverride}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmMerchantOverride
	 * CardPaymentTransaction81.mmMerchantOverride}</li>
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
	public static final MMBusinessAttribute mmMerchantOverride = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction4.mmMerchantOverride, CardPaymentTransaction14.mmMerchantOverride, CardPaymentTransaction3.mmMerchantOverride, CardPaymentTransaction13.mmMerchantOverride,
					CardPaymentTransaction29.mmMerchantOverride, CardPaymentTransaction25.mmMerchantOverride, CardPaymentTransaction45.mmMerchantOverride, CardPaymentTransaction40.mmMerchantOverride,
					CardPaymentTransaction60.mmMerchantOverride, CardPaymentTransaction55.mmMerchantOverride, CardPaymentTransaction70.mmMerchantOverride, CardPaymentTransaction69.mmMerchantOverride,
					CardPaymentTransaction81.mmMerchantOverride);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantOverride";
			definition = "Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getMerchantOverride", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate validityDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmValidityDate
	 * CardPaymentTransactionDetails4.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#mmValidityDate
	 * CardPaymentTransactionDetails7.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#mmValidityDate
	 * CardPaymentTransactionDetails9.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmValidityDate
	 * CardPaymentTransactionDetails1.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmValidityDate
	 * CardPaymentTransactionDetails10.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmValidityDate
	 * CardPaymentTransactionDetails2.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#mmValidityDate
	 * CardPaymentTransactionDetails11.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#mmValidityDate
	 * CardPaymentTransactionDetails5.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmValidityDate
	 * CardPaymentTransactionDetails3.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmValidityDate
	 * CardPaymentTransactionDetails12.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmValidityDate
	 * CardPaymentTransactionDetails13.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmValidityDate
	 * CardPaymentTransactionDetails16.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmValidityDate
	 * CardPaymentTransactionDetails14.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmValidityDate
	 * CardPaymentTransactionDetails15.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#mmValidityDate
	 * CardPaymentTransactionDetails17.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmValidityDate
	 * CardPaymentTransactionDetails20.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#mmValidityDate
	 * CardPaymentTransactionDetails25.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmValidityDate
	 * CardPaymentTransactionDetails23.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmValidityDate
	 * CardPaymentTransactionDetails21.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmValidityDate
	 * CardPaymentTransactionDetails19.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmValidityDate
	 * CardPaymentTransactionDetails24.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmValidityDate
	 * CardPaymentTransactionDetails32.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmValidityDate
	 * CardPaymentTransactionDetails28.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmValidityDate
	 * CardPaymentTransactionDetails29.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmValidityDate
	 * CardPaymentTransactionDetails30.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmValidityDate
	 * CardPaymentTransactionDetails27.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmValidityDate
	 * CardPaymentTransactionDetails31.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#mmValidityDate
	 * CardPaymentTransactionDetails34.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmValidityDate
	 * CardPaymentTransactionDetails39.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmValidityDate
	 * CardPaymentTransactionDetails38.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmValidityDate
	 * CardPaymentTransactionDetails41.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmValidityDate
	 * CardPaymentTransactionDetails37.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#mmValidityDate
	 * CardPaymentTransactionDetails42.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#mmValidityDate
	 * CardPaymentTransactionDetails43.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails44#mmValidityDate
	 * CardPaymentTransactionDetails44.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmValidityDate
	 * CardPaymentTransactionDetails45.mmValidityDate}</li>
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
	public static final MMBusinessAttribute mmValidityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails4.mmValidityDate, CardPaymentTransactionDetails7.mmValidityDate, CardPaymentTransactionDetails9.mmValidityDate, CardPaymentTransactionDetails1.mmValidityDate,
					CardPaymentTransactionDetails10.mmValidityDate, CardPaymentTransactionDetails2.mmValidityDate, CardPaymentTransactionDetails11.mmValidityDate, CardPaymentTransactionDetails5.mmValidityDate,
					CardPaymentTransactionDetails3.mmValidityDate, CardPaymentTransactionDetails12.mmValidityDate, CardPaymentTransactionDetails13.mmValidityDate, CardPaymentTransactionDetails16.mmValidityDate,
					CardPaymentTransactionDetails14.mmValidityDate, CardPaymentTransactionDetails15.mmValidityDate, CardPaymentTransactionDetails17.mmValidityDate, CardPaymentTransactionDetails20.mmValidityDate,
					CardPaymentTransactionDetails25.mmValidityDate, CardPaymentTransactionDetails23.mmValidityDate, CardPaymentTransactionDetails21.mmValidityDate, CardPaymentTransactionDetails19.mmValidityDate,
					CardPaymentTransactionDetails24.mmValidityDate, CardPaymentTransactionDetails32.mmValidityDate, CardPaymentTransactionDetails28.mmValidityDate, CardPaymentTransactionDetails29.mmValidityDate,
					CardPaymentTransactionDetails30.mmValidityDate, CardPaymentTransactionDetails27.mmValidityDate, CardPaymentTransactionDetails31.mmValidityDate, CardPaymentTransactionDetails34.mmValidityDate,
					CardPaymentTransactionDetails39.mmValidityDate, CardPaymentTransactionDetails38.mmValidityDate, CardPaymentTransactionDetails41.mmValidityDate, CardPaymentTransactionDetails37.mmValidityDate,
					CardPaymentTransactionDetails42.mmValidityDate, CardPaymentTransactionDetails43.mmValidityDate, CardPaymentTransactionDetails44.mmValidityDate, CardPaymentTransactionDetails45.mmValidityDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getValidityDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CardPaymentAcquiring cardPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse2#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAction
	 * AuthorisationResult9.mmAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAction
	 * AuthorisationResult13.mmAction}</li>
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
	public static final MMBusinessAssociationEnd mmCardPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionAdviceResponse2.mmTransactionIdentification, CardPaymentTransactionAdviceResponse1.mmTransactionIdentification,
					CardPaymentTransactionAdviceResponse3.mmTransactionIdentification, CardPaymentTransactionAdviceResponse4.mmTransactionIdentification, CardPaymentTransactionAdviceResponse5.mmTransactionIdentification,
					AuthorisationResult9.mmAction, CardPaymentTransactionAdviceResponse6.mmTransactionIdentification, AuthorisationResult13.mmAction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment to which the validation process applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Response> response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Response#mmRelatedCardPaymentValidation
	 * Response.mmRelatedCardPaymentValidation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#mmResponseToAuthorisation
	 * AuthorisationResult1.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#mmResponseToAuthorisation
	 * AuthorisationResult2.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#mmResponseToAuthorisation
	 * AuthorisationResult3.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse1#mmTransaction
	 * AcceptorCancellationAdviceResponse1.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2#mmTransaction
	 * AcceptorCancellationAdviceResponse2.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#mmTransaction
	 * AcceptorCompletionAdviceResponse1.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2#mmTransaction
	 * AcceptorCompletionAdviceResponse2.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1#mmTransactionResponse
	 * AcceptorReconciliationResponse1.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#mmTransactionResponse
	 * AcceptorReconciliationResponse2.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#mmTransaction
	 * AcceptorCancellationAdviceResponse3.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse3#mmTransaction
	 * AcceptorCompletionAdviceResponse3.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#mmTransactionResponse
	 * AcceptorReconciliationResponse3.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#mmTransaction
	 * AcceptorCancellationAdviceResponse4.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse4#mmTransaction
	 * AcceptorCompletionAdviceResponse4.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmResponseToAuthorisation
	 * AuthorisationResult4.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmResponseToAuthorisation
	 * AuthorisationResult5.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#mmResponseToAuthorisation
	 * AuthorisationResult6.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmTransactionResponse
	 * AuthorisationResult8.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#mmTransactionResponse
	 * AuthorisationResult7.mmTransactionResponse}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction4#mmResponse
	 * ATMTransaction4.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAuthorisationResponse
	 * AuthorisationResult9.mmAuthorisationResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmResponseTrace
	 * AuthorisationResult9.mmResponseTrace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmTransactionResponse
	 * CardTransaction10.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAuthorisationResult
	 * CardTransaction4.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmTransactionResponse
	 * CardTransaction9.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionResponse
	 * CardTransaction8.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction7#mmTransactionResponse
	 * CardTransaction7.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmTransactionVerificationResult
	 * CardTransactionDetail2.mmTransactionVerificationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmAuthorisationResult
	 * CardTransaction6.mmAuthorisationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionVerificationResult
	 * CardTransactionDetail4.mmTransactionVerificationResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmTransaction
	 * AcceptorCancellationAdviceResponse5.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#mmTransactionResponse
	 * AcceptorReconciliationResponse4.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse5#mmTransaction
	 * AcceptorCompletionAdviceResponse5.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#mmResponseToAuthorisation
	 * AuthorisationResult12.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmResponseToAuthorisation
	 * AuthorisationResult11.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmResponseToAuthorisation
	 * AuthorisationResult10.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationResponse
	 * AuthorisationResult13.mmAuthorisationResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction18#mmResponse
	 * ATMTransaction18.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmTransaction
	 * AcceptorCancellationAdviceResponse6.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse6#mmTransaction
	 * AcceptorCompletionAdviceResponse6.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse7#mmTransaction
	 * AcceptorCancellationAdviceResponse7.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse5#mmTransactionResponse
	 * AcceptorReconciliationResponse5.mmTransactionResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse7#mmTransaction
	 * AcceptorCompletionAdviceResponse7.mmTransaction}</li>
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
	public static final MMBusinessAssociationEnd mmResponse = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AuthorisationResult1.mmResponseToAuthorisation, AuthorisationResult2.mmResponseToAuthorisation, AuthorisationResult3.mmResponseToAuthorisation,
					AcceptorCancellationAdviceResponse1.mmTransaction, AcceptorCancellationAdviceResponse2.mmTransaction, AcceptorCompletionAdviceResponse1.mmTransaction, AcceptorCompletionAdviceResponse2.mmTransaction,
					AcceptorReconciliationResponse1.mmTransactionResponse, AcceptorReconciliationResponse2.mmTransactionResponse, AcceptorCancellationAdviceResponse3.mmTransaction, AcceptorCompletionAdviceResponse3.mmTransaction,
					AcceptorReconciliationResponse3.mmTransactionResponse, AcceptorCancellationAdviceResponse4.mmTransaction, AcceptorCompletionAdviceResponse4.mmTransaction, AuthorisationResult4.mmResponseToAuthorisation,
					AuthorisationResult5.mmResponseToAuthorisation, AuthorisationResult6.mmResponseToAuthorisation, AuthorisationResult8.mmTransactionResponse, AuthorisationResult7.mmTransactionResponse, ATMTransaction4.mmResponse,
					AuthorisationResult9.mmAuthorisationResponse, AuthorisationResult9.mmResponseTrace, CardTransaction10.mmTransactionResponse, CardTransaction4.mmAuthorisationResult, CardTransaction9.mmTransactionResponse,
					CardTransaction8.mmTransactionResponse, CardTransaction7.mmTransactionResponse, CardTransactionDetail2.mmTransactionVerificationResult, CardTransaction6.mmAuthorisationResult,
					CardTransactionDetail4.mmTransactionVerificationResult, AcceptorCancellationAdviceResponse5.mmTransaction, AcceptorReconciliationResponse4.mmTransactionResponse, AcceptorCompletionAdviceResponse5.mmTransaction,
					AuthorisationResult12.mmResponseToAuthorisation, AuthorisationResult11.mmResponseToAuthorisation, AuthorisationResult10.mmResponseToAuthorisation, AuthorisationResult13.mmAuthorisationResponse,
					ATMTransaction18.mmResponse, AcceptorCancellationAdviceResponse6.mmTransaction, AcceptorCompletionAdviceResponse6.mmTransaction, AcceptorCancellationAdviceResponse7.mmTransaction,
					AcceptorReconciliationResponse5.mmTransactionResponse, AcceptorCompletionAdviceResponse7.mmTransaction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Response";
			definition = "Response to an authorisation request.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Response.mmRelatedCardPaymentValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Response.mmObject();
		}
	};
	protected Min6Max8Text authorisationCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult1#mmAuthorisationCode
	 * CardPaymentTransactionResult1.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#mmAuthorisationCode
	 * AuthorisationResult1.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#mmAuthorisationCode
	 * AuthorisationResult2.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#mmAuthorisationCode
	 * AuthorisationResult3.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmAuthorisationCode
	 * AuthorisationResult4.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmAuthorisationCode
	 * AuthorisationResult5.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult2#mmAuthorisationCode
	 * CardPaymentTransactionResult2.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#mmAuthorisationCode
	 * AuthorisationResult6.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAuthorisationCode
	 * AuthorisationResult8.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#mmAuthorisationCode
	 * AuthorisationResult7.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAuthorisationCode
	 * AuthorisationResult9.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionResult3#mmAuthorisationCode
	 * CardPaymentTransactionResult3.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#mmAuthorisationCode
	 * AuthorisationResult12.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmAuthorisationCode
	 * AuthorisationResult11.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmAuthorisationCode
	 * AuthorisationResult10.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationCode
	 * AuthorisationResult13.mmAuthorisationCode}</li>
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
	public static final MMBusinessAttribute mmAuthorisationCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionResult1.mmAuthorisationCode, AuthorisationResult1.mmAuthorisationCode, AuthorisationResult2.mmAuthorisationCode, AuthorisationResult3.mmAuthorisationCode,
					AuthorisationResult4.mmAuthorisationCode, AuthorisationResult5.mmAuthorisationCode, CardPaymentTransactionResult2.mmAuthorisationCode, AuthorisationResult6.mmAuthorisationCode, AuthorisationResult8.mmAuthorisationCode,
					AuthorisationResult7.mmAuthorisationCode, AuthorisationResult9.mmAuthorisationCode, CardPaymentTransactionResult3.mmAuthorisationCode, AuthorisationResult12.mmAuthorisationCode,
					AuthorisationResult11.mmAuthorisationCode, AuthorisationResult10.mmAuthorisationCode, AuthorisationResult13.mmAuthorisationCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getAuthorisationCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OnLineReasonCode onLineReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmOnLineReason
	 * CardPaymentTransactionDetails1.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmOnLineReason
	 * CardPaymentTransactionDetails10.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmOnLineReason
	 * CardPaymentTransactionDetails12.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmOnLineReason
	 * CardPaymentTransactionDetails16.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmOnLineReason
	 * CardPaymentTransactionDetails19.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmOnLineReason
	 * CardPaymentTransactionDetails24.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmOnLineReason
	 * CardPaymentTransactionDetails27.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmOnLineReason
	 * CardPaymentTransactionDetails31.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmOnLineReason
	 * CardPaymentTransactionDetails39.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmOnLineReason
	 * CardPaymentTransactionDetails41.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails45#mmOnLineReason
	 * CardPaymentTransactionDetails45.mmOnLineReason}</li>
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
	public static final MMBusinessAttribute mmOnLineReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails1.mmOnLineReason, CardPaymentTransactionDetails10.mmOnLineReason, CardPaymentTransactionDetails12.mmOnLineReason,
					CardPaymentTransactionDetails16.mmOnLineReason, CardPaymentTransactionDetails19.mmOnLineReason, CardPaymentTransactionDetails24.mmOnLineReason, CardPaymentTransactionDetails27.mmOnLineReason,
					CardPaymentTransactionDetails31.mmOnLineReason, CardPaymentTransactionDetails39.mmOnLineReason, CardPaymentTransactionDetails41.mmOnLineReason, CardPaymentTransactionDetails45.mmOnLineReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OnLineReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getOnLineReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashBalance balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedCardPaymentValidationProcess
	 * CashBalance.mmRelatedCardPaymentValidationProcess}</li>
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
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Balance of the account attached to the payment card.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmRelatedCardPaymentValidationProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected CardholderAddressVerificationResultCode cardholderAddressVerificationResult;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCardholderAddressVerificationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getCardholderAddressVerificationResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CSCResultCode cSCResult;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCSCResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed CSC (Card Security Code) validation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CSCResultCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getCSCResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ProductCategory> declinedProductCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmRelatedCardPaymentValidation
	 * ProductCategory.mmRelatedCardPaymentValidation}</li>
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
	public static final MMBusinessAssociationEnd mmDeclinedProductCode = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the payment authorisation was declined.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmRelatedCardPaymentValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductCategory.mmObject();
		}
	};
	protected Max500Text electronicCommerceAuthenticationResult;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmElectronicCommerceAuthenticationResult = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getElectronicCommerceAuthenticationResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FailureReasonCode failureReason;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmFailureReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "Incident occuring during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CardPaymentValidation.class.getMethod("getFailureReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Signature> signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#mmCardPaymentValidation
	 * Signature.mmCardPaymentValidation}</li>
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
	public static final MMBusinessAssociationEnd mmSignature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Signature of the message to display or print.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Signature.mmCardPaymentValidation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Signature.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentValidation";
				definition = "Results and parameters of the card payment verification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashBalance.mmRelatedCardPaymentValidationProcess, com.tools20022.repository.entity.Signature.mmCardPaymentValidation,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmValidation, com.tools20022.repository.entity.ProductCategory.mmRelatedCardPaymentValidation,
						com.tools20022.repository.entity.Response.mmRelatedCardPaymentValidation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentValidation.mmTransactionSuccess, com.tools20022.repository.entity.CardPaymentValidation.mmMerchantOverride,
						com.tools20022.repository.entity.CardPaymentValidation.mmValidityDate, com.tools20022.repository.entity.CardPaymentValidation.mmCardPayment, com.tools20022.repository.entity.CardPaymentValidation.mmResponse,
						com.tools20022.repository.entity.CardPaymentValidation.mmAuthorisationCode, com.tools20022.repository.entity.CardPaymentValidation.mmOnLineReason, com.tools20022.repository.entity.CardPaymentValidation.mmBalance,
						com.tools20022.repository.entity.CardPaymentValidation.mmCardholderAddressVerificationResult, com.tools20022.repository.entity.CardPaymentValidation.mmCSCResult,
						com.tools20022.repository.entity.CardPaymentValidation.mmDeclinedProductCode, com.tools20022.repository.entity.CardPaymentValidation.mmElectronicCommerceAuthenticationResult,
						com.tools20022.repository.entity.CardPaymentValidation.mmFailureReason, com.tools20022.repository.entity.CardPaymentValidation.mmSignature);
				derivationComponent_lazy = () -> Arrays.asList(AuthorisationResult1.mmObject(), AuthorisationResult2.mmObject(), AuthorisationResult3.mmObject(), AuthorisationResult4.mmObject(), AuthorisationResult5.mmObject(),
						AuthorisationResult6.mmObject(), AuthorisationResult8.mmObject(), AuthorisationResult7.mmObject(), AuthorisationResult9.mmObject(), AuthorisationResult12.mmObject(), AuthorisationResult11.mmObject(),
						AuthorisationResult10.mmObject(), AuthorisationResult13.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPaymentValidation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getTransactionSuccess() {
		return transactionSuccess;
	}

	public CardPaymentValidation setTransactionSuccess(TrueFalseIndicator transactionSuccess) {
		this.transactionSuccess = Objects.requireNonNull(transactionSuccess);
		return this;
	}

	public TrueFalseIndicator getMerchantOverride() {
		return merchantOverride;
	}

	public CardPaymentValidation setMerchantOverride(TrueFalseIndicator merchantOverride) {
		this.merchantOverride = Objects.requireNonNull(merchantOverride);
		return this;
	}

	public ISODate getValidityDate() {
		return validityDate;
	}

	public CardPaymentValidation setValidityDate(ISODate validityDate) {
		this.validityDate = Objects.requireNonNull(validityDate);
		return this;
	}

	public Optional<CardPaymentAcquiring> getCardPayment() {
		return cardPayment == null ? Optional.empty() : Optional.of(cardPayment);
	}

	public CardPaymentValidation setCardPayment(com.tools20022.repository.entity.CardPaymentAcquiring cardPayment) {
		this.cardPayment = cardPayment;
		return this;
	}

	public List<Response> getResponse() {
		return response == null ? response = new ArrayList<>() : response;
	}

	public CardPaymentValidation setResponse(List<com.tools20022.repository.entity.Response> response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public Min6Max8Text getAuthorisationCode() {
		return authorisationCode;
	}

	public CardPaymentValidation setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = Objects.requireNonNull(authorisationCode);
		return this;
	}

	public OnLineReasonCode getOnLineReason() {
		return onLineReason;
	}

	public CardPaymentValidation setOnLineReason(OnLineReasonCode onLineReason) {
		this.onLineReason = Objects.requireNonNull(onLineReason);
		return this;
	}

	public Optional<CashBalance> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CardPaymentValidation setBalance(com.tools20022.repository.entity.CashBalance balance) {
		this.balance = balance;
		return this;
	}

	public CardholderAddressVerificationResultCode getCardholderAddressVerificationResult() {
		return cardholderAddressVerificationResult;
	}

	public CardPaymentValidation setCardholderAddressVerificationResult(CardholderAddressVerificationResultCode cardholderAddressVerificationResult) {
		this.cardholderAddressVerificationResult = Objects.requireNonNull(cardholderAddressVerificationResult);
		return this;
	}

	public CSCResultCode getCSCResult() {
		return cSCResult;
	}

	public CardPaymentValidation setCSCResult(CSCResultCode cSCResult) {
		this.cSCResult = Objects.requireNonNull(cSCResult);
		return this;
	}

	public List<ProductCategory> getDeclinedProductCode() {
		return declinedProductCode == null ? declinedProductCode = new ArrayList<>() : declinedProductCode;
	}

	public CardPaymentValidation setDeclinedProductCode(List<com.tools20022.repository.entity.ProductCategory> declinedProductCode) {
		this.declinedProductCode = Objects.requireNonNull(declinedProductCode);
		return this;
	}

	public Max500Text getElectronicCommerceAuthenticationResult() {
		return electronicCommerceAuthenticationResult;
	}

	public CardPaymentValidation setElectronicCommerceAuthenticationResult(Max500Text electronicCommerceAuthenticationResult) {
		this.electronicCommerceAuthenticationResult = Objects.requireNonNull(electronicCommerceAuthenticationResult);
		return this;
	}

	public FailureReasonCode getFailureReason() {
		return failureReason;
	}

	public CardPaymentValidation setFailureReason(FailureReasonCode failureReason) {
		this.failureReason = Objects.requireNonNull(failureReason);
		return this;
	}

	public List<Signature> getSignature() {
		return signature == null ? signature = new ArrayList<>() : signature;
	}

	public CardPaymentValidation setSignature(List<com.tools20022.repository.entity.Signature> signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}