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
import com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code;
import com.tools20022.repository.codeset.CSCResult1Code;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Result of the verifications performed by the issuer to deliver or decline the
 * authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1#mmElectronicCommerceAuthenticationResult
 * TransactionVerificationResult1.mmElectronicCommerceAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1#mmCSCResult
 * TransactionVerificationResult1.mmCSCResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1#mmCardholderAddressVerificationResult
 * TransactionVerificationResult1.mmCardholderAddressVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1#mmDeclinedProductCode
 * TransactionVerificationResult1.mmDeclinedProductCode}</li>
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
 * "TransactionVerificationResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of the verifications performed by the issuer to deliver or decline the authorisation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionVerificationResult2
 * TransactionVerificationResult2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class TransactionVerificationResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max500Text electronicCommerceAuthenticationResult;
	/**
	 * Result of an e-commerce authentication process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1
	 * TransactionVerificationResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncComrcAuthntcnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerceAuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of an e-commerce authentication process."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicCommerceAuthenticationResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncComrcAuthntcnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	protected CSCResult1Code cSCResult;
	/**
	 * Result of the printed card security code (CSC) validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CSCResult1Code
	 * CSCResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1
	 * TransactionVerificationResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSCRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the printed card security code (CSC) validation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSCResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "CSCRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed card security code (CSC) validation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CSCResult1Code.mmObject();
		}
	};
	protected CardholderAddressVerificationResult1Code cardholderAddressVerificationResult;
	/**
	 * Result of the cardholder verification address checks on the street number
	 * and the postal code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1
	 * TransactionVerificationResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrAdrVrfctnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderAddressVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the cardholder verification address checks on the street number and the postal code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardholderAddressVerificationResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrAdrVrfctnRslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
		}
	};
	protected List<Max70Text> declinedProductCode;
	/**
	 * Product code for which the authorisation was declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult1
	 * TransactionVerificationResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclndPdctCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclinedProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product code for which the authorisation was declined."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclinedProductCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "DclndPdctCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the authorisation was declined.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionVerificationResult1.mmElectronicCommerceAuthenticationResult, com.tools20022.repository.msg.TransactionVerificationResult1.mmCSCResult,
						com.tools20022.repository.msg.TransactionVerificationResult1.mmCardholderAddressVerificationResult, com.tools20022.repository.msg.TransactionVerificationResult1.mmDeclinedProductCode);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionVerificationResult1";
				definition = "Result of the verifications performed by the issuer to deliver or decline the authorisation.";
				nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max500Text getElectronicCommerceAuthenticationResult() {
		return electronicCommerceAuthenticationResult;
	}

	public void setElectronicCommerceAuthenticationResult(Max500Text electronicCommerceAuthenticationResult) {
		this.electronicCommerceAuthenticationResult = electronicCommerceAuthenticationResult;
	}

	public CSCResult1Code getCSCResult() {
		return cSCResult;
	}

	public void setCSCResult(CSCResult1Code cSCResult) {
		this.cSCResult = cSCResult;
	}

	public CardholderAddressVerificationResult1Code getCardholderAddressVerificationResult() {
		return cardholderAddressVerificationResult;
	}

	public void setCardholderAddressVerificationResult(CardholderAddressVerificationResult1Code cardholderAddressVerificationResult) {
		this.cardholderAddressVerificationResult = cardholderAddressVerificationResult;
	}

	public List<Max70Text> getDeclinedProductCode() {
		return declinedProductCode;
	}

	public void setDeclinedProductCode(List<Max70Text> declinedProductCode) {
		this.declinedProductCode = declinedProductCode;
	}
}