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
import com.tools20022.repository.codeset.AuthenticationMethod7Code;
import com.tools20022.repository.codeset.Verification1Code;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmMethod
 * TransactionVerificationResult5.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmVerificationEntity
 * TransactionVerificationResult5.mmVerificationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmResult
 * TransactionVerificationResult5.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmAdditionalResult
 * TransactionVerificationResult5.mmAdditionalResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmAuthenticationToken
 * TransactionVerificationResult5.mmAuthenticationToken}</li>
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
 * "TransactionVerificationResult5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of performed verifications for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
 * TransactionVerificationResult4}</li>
 * </ul>
 */
public class TransactionVerificationResult5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuthenticationMethod7Code method;
	/**
	 * Method of verification that has been performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
	 * TransactionVerificationResult5}</li>
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
	 * definition} = "Method of verification that has been performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmMethod
	 * TransactionVerificationResult4.mmMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult5.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method of verification that has been performed.";
			previousVersion_lazy = () -> TransactionVerificationResult4.mmMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod7Code.mmObject();
		}
	};
	protected AuthenticationEntity2Code verificationEntity;
	/**
	 * Entity or device that has performed the verification.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
	 * TransactionVerificationResult5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmVerificationEntity
	 * TransactionVerificationResult4.mmVerificationEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVerificationEntity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult5.mmObject();
			isDerived = false;
			xmlTag = "VrfctnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerificationEntity";
			definition = "Entity or device that has performed the verification.";
			previousVersion_lazy = () -> TransactionVerificationResult4.mmVerificationEntity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AuthenticationEntity2Code.mmObject();
		}
	};
	protected Verification1Code result;
	/**
	 * Result of the verification.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
	 * TransactionVerificationResult5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmResult
	 * TransactionVerificationResult4.mmResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult5.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of the verification.";
			previousVersion_lazy = () -> TransactionVerificationResult4.mmResult;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Verification1Code.mmObject();
		}
	};
	protected Max500Text additionalResult;
	/**
	 * Additional result of the verification.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
	 * TransactionVerificationResult5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmAdditionalResult
	 * TransactionVerificationResult4.mmAdditionalResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult5.mmObject();
			isDerived = false;
			xmlTag = "AddtlRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResult";
			definition = "Additional result of the verification.";
			previousVersion_lazy = () -> TransactionVerificationResult4.mmAdditionalResult;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	protected Max140Binary authenticationToken;
	/**
	 * Token provided to the ATM for further proof of authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
	 * TransactionVerificationResult5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnTkn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Token provided to the ATM for further proof of authentication."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationToken = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionVerificationResult5.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationToken";
			definition = "Token provided to the ATM for further proof of authentication.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionVerificationResult5.mmMethod, TransactionVerificationResult5.mmVerificationEntity, TransactionVerificationResult5.mmResult,
						TransactionVerificationResult5.mmAdditionalResult, TransactionVerificationResult5.mmAuthenticationToken);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionVerificationResult5";
				definition = "Result of performed verifications for the transaction.";
				previousVersion_lazy = () -> TransactionVerificationResult4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod7Code getMethod() {
		return method;
	}

	public void setMethod(AuthenticationMethod7Code method) {
		this.method = method;
	}

	public AuthenticationEntity2Code getVerificationEntity() {
		return verificationEntity;
	}

	public void setVerificationEntity(AuthenticationEntity2Code verificationEntity) {
		this.verificationEntity = verificationEntity;
	}

	public Verification1Code getResult() {
		return result;
	}

	public void setResult(Verification1Code result) {
		this.result = result;
	}

	public Max500Text getAdditionalResult() {
		return additionalResult;
	}

	public void setAdditionalResult(Max500Text additionalResult) {
		this.additionalResult = additionalResult;
	}

	public Max140Binary getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(Max140Binary authenticationToken) {
		this.authenticationToken = authenticationToken;
	}
}