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
import com.tools20022.repository.codeset.AuthenticationEntity2Code;
import com.tools20022.repository.codeset.AuthenticationMethod4Code;
import com.tools20022.repository.codeset.Verification1Code;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of performed verifications for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3#mmMethod
 * TransactionVerificationResult3.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3#mmVerificationEntity
 * TransactionVerificationResult3.mmVerificationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3#mmResult
 * TransactionVerificationResult3.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3#mmAdditionalResult
 * TransactionVerificationResult3.mmAdditionalResult}</li>
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
 * "TransactionVerificationResult3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of performed verifications for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
 * TransactionVerificationResult4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult2
 * TransactionVerificationResult2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionVerificationResult3", propOrder = {"method", "verificationEntity", "result", "additionalResult"})
public class TransactionVerificationResult3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mtd", required = true)
	protected AuthenticationMethod4Code method;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod4Code
	 * AuthenticationMethod4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3
	 * TransactionVerificationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method of verification that has been used."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmMethod
	 * TransactionVerificationResult4.mmMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult3.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method of verification that has been used.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult4.mmMethod);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod4Code.mmObject();
		}
	};
	@XmlElement(name = "VrfctnNtty")
	protected AuthenticationEntity2Code verificationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3
	 * TransactionVerificationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VrfctnNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerificationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity or device that has performed the verification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmVerificationEntity
	 * TransactionVerificationResult4.mmVerificationEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVerificationEntity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult3.mmObject();
			isDerived = false;
			xmlTag = "VrfctnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerificationEntity";
			definition = "Entity or device that has performed the verification.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult4.mmVerificationEntity);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AuthenticationEntity2Code.mmObject();
		}
	};
	@XmlElement(name = "Rslt")
	protected Verification1Code result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Verification1Code
	 * Verification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3
	 * TransactionVerificationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the verification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmResult
	 * TransactionVerificationResult4.mmResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult3.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of the verification.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult4.mmResult);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Verification1Code.mmObject();
		}
	};
	@XmlElement(name = "AddtlRslt")
	protected Max500Text additionalResult;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult3
	 * TransactionVerificationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional result of the verification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmAdditionalResult
	 * TransactionVerificationResult4.mmAdditionalResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult3.mmObject();
			isDerived = false;
			xmlTag = "AddtlRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResult";
			definition = "Additional result of the verification.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult4.mmAdditionalResult);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionVerificationResult3.mmMethod, com.tools20022.repository.msg.TransactionVerificationResult3.mmVerificationEntity,
						com.tools20022.repository.msg.TransactionVerificationResult3.mmResult, com.tools20022.repository.msg.TransactionVerificationResult3.mmAdditionalResult);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionVerificationResult3";
				definition = "Result of performed verifications for the transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult4.mmObject());
				previousVersion_lazy = () -> TransactionVerificationResult2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod4Code getMethod() {
		return method;
	}

	public TransactionVerificationResult3 setMethod(AuthenticationMethod4Code method) {
		this.method = Objects.requireNonNull(method);
		return this;
	}

	public Optional<AuthenticationEntity2Code> getVerificationEntity() {
		return verificationEntity == null ? Optional.empty() : Optional.of(verificationEntity);
	}

	public TransactionVerificationResult3 setVerificationEntity(AuthenticationEntity2Code verificationEntity) {
		this.verificationEntity = verificationEntity;
		return this;
	}

	public Optional<Verification1Code> getResult() {
		return result == null ? Optional.empty() : Optional.of(result);
	}

	public TransactionVerificationResult3 setResult(Verification1Code result) {
		this.result = result;
		return this;
	}

	public Optional<Max500Text> getAdditionalResult() {
		return additionalResult == null ? Optional.empty() : Optional.of(additionalResult);
	}

	public TransactionVerificationResult3 setAdditionalResult(Max500Text additionalResult) {
		this.additionalResult = additionalResult;
		return this;
	}
}