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
import com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code;
import com.tools20022.repository.codeset.CSCResult1Code;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionVerificationResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of the verifications performed by the issuer to deliver or decline the authorisation."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionVerificationResult2
 * TransactionVerificationResult2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionVerificationResult1", propOrder = {"electronicCommerceAuthenticationResult", "cSCResult", "cardholderAddressVerificationResult", "declinedProductCode"})
public class TransactionVerificationResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ElctrncComrcAuthntcnRslt")
	protected Max500Text electronicCommerceAuthenticationResult;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerceAuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of an e-commerce authentication process."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult1, Optional<Max500Text>> mmElectronicCommerceAuthenticationResult = new MMMessageAttribute<TransactionVerificationResult1, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncComrcAuthntcnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCommerceAuthenticationResult";
			definition = "Result of an e-commerce authentication process.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(TransactionVerificationResult1 obj) {
			return obj.getElectronicCommerceAuthenticationResult();
		}

		@Override
		public void setValue(TransactionVerificationResult1 obj, Optional<Max500Text> value) {
			obj.setElectronicCommerceAuthenticationResult(value.orElse(null));
		}
	};
	@XmlElement(name = "CSCRslt")
	protected CSCResult1Code cSCResult;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the printed card security code (CSC) validation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult1, Optional<CSCResult1Code>> mmCSCResult = new MMMessageAttribute<TransactionVerificationResult1, Optional<CSCResult1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "CSCRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCResult";
			definition = "Result of the printed card security code (CSC) validation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CSCResult1Code.mmObject();
		}

		@Override
		public Optional<CSCResult1Code> getValue(TransactionVerificationResult1 obj) {
			return obj.getCSCResult();
		}

		@Override
		public void setValue(TransactionVerificationResult1 obj, Optional<CSCResult1Code> value) {
			obj.setCSCResult(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrAdrVrfctnRslt")
	protected CardholderAddressVerificationResult1Code cardholderAddressVerificationResult;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderAddressVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the cardholder verification address checks on the street number and the postal code."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult1, Optional<CardholderAddressVerificationResult1Code>> mmCardholderAddressVerificationResult = new MMMessageAttribute<TransactionVerificationResult1, Optional<CardholderAddressVerificationResult1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrAdrVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderAddressVerificationResult";
			definition = "Result of the cardholder verification address checks on the street number and the postal code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
		}

		@Override
		public Optional<CardholderAddressVerificationResult1Code> getValue(TransactionVerificationResult1 obj) {
			return obj.getCardholderAddressVerificationResult();
		}

		@Override
		public void setValue(TransactionVerificationResult1 obj, Optional<CardholderAddressVerificationResult1Code> value) {
			obj.setCardholderAddressVerificationResult(value.orElse(null));
		}
	};
	@XmlElement(name = "DclndPdctCd")
	protected List<Max70Text> declinedProductCode;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclinedProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product code for which the authorisation was declined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult1, List<Max70Text>> mmDeclinedProductCode = new MMMessageAttribute<TransactionVerificationResult1, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult1.mmObject();
			isDerived = false;
			xmlTag = "DclndPdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclinedProductCode";
			definition = "Product code for which the authorisation was declined.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(TransactionVerificationResult1 obj) {
			return obj.getDeclinedProductCode();
		}

		@Override
		public void setValue(TransactionVerificationResult1 obj, List<Max70Text> value) {
			obj.setDeclinedProductCode(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionVerificationResult1.mmElectronicCommerceAuthenticationResult, com.tools20022.repository.msg.TransactionVerificationResult1.mmCSCResult,
						com.tools20022.repository.msg.TransactionVerificationResult1.mmCardholderAddressVerificationResult, com.tools20022.repository.msg.TransactionVerificationResult1.mmDeclinedProductCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionVerificationResult1";
				definition = "Result of the verifications performed by the issuer to deliver or decline the authorisation.";
				nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max500Text> getElectronicCommerceAuthenticationResult() {
		return electronicCommerceAuthenticationResult == null ? Optional.empty() : Optional.of(electronicCommerceAuthenticationResult);
	}

	public TransactionVerificationResult1 setElectronicCommerceAuthenticationResult(Max500Text electronicCommerceAuthenticationResult) {
		this.electronicCommerceAuthenticationResult = electronicCommerceAuthenticationResult;
		return this;
	}

	public Optional<CSCResult1Code> getCSCResult() {
		return cSCResult == null ? Optional.empty() : Optional.of(cSCResult);
	}

	public TransactionVerificationResult1 setCSCResult(CSCResult1Code cSCResult) {
		this.cSCResult = cSCResult;
		return this;
	}

	public Optional<CardholderAddressVerificationResult1Code> getCardholderAddressVerificationResult() {
		return cardholderAddressVerificationResult == null ? Optional.empty() : Optional.of(cardholderAddressVerificationResult);
	}

	public TransactionVerificationResult1 setCardholderAddressVerificationResult(CardholderAddressVerificationResult1Code cardholderAddressVerificationResult) {
		this.cardholderAddressVerificationResult = cardholderAddressVerificationResult;
		return this;
	}

	public List<Max70Text> getDeclinedProductCode() {
		return declinedProductCode == null ? declinedProductCode = new ArrayList<>() : declinedProductCode;
	}

	public TransactionVerificationResult1 setDeclinedProductCode(List<Max70Text> declinedProductCode) {
		this.declinedProductCode = Objects.requireNonNull(declinedProductCode);
		return this;
	}
}