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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.PositiveNumber;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IsabelEpaymentTokenResponse1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the LRCI protocol extension details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1#mmImageHashAlgorithm
 * IsabelLRCIExtension1.mmImageHashAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1#mmTokenResponse
 * IsabelLRCIExtension1.mmTokenResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1#mmTokenResponsePaymentInformationIndex
 * IsabelLRCIExtension1.mmTokenResponsePaymentInformationIndex}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelLRCIExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the LRCI protocol extension details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelLRCIExtension1", propOrder = {"imageHashAlgorithm", "tokenResponse", "tokenResponsePaymentInformationIndex"})
public class IsabelLRCIExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ImgHashAlgo", required = true)
	protected Max105Text imageHashAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1
	 * IsabelLRCIExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImgHashAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImageHashAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective method for calculating the (cryptographic) hash value of each visual representation of a payment file."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelLRCIExtension1, Max105Text> mmImageHashAlgorithm = new MMMessageAttribute<IsabelLRCIExtension1, Max105Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelLRCIExtension1.mmObject();
			isDerived = false;
			xmlTag = "ImgHashAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImageHashAlgorithm";
			definition = "Effective method for calculating the (cryptographic) hash value of each visual representation of a payment file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(IsabelLRCIExtension1 obj) {
			return obj.getImageHashAlgorithm();
		}

		@Override
		public void setValue(IsabelLRCIExtension1 obj, Max105Text value) {
			obj.setImageHashAlgorithm(value);
		}
	};
	@XmlElement(name = "TknRspn", required = true)
	protected IsabelEpaymentTokenResponse1 tokenResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1
	 * IsabelEpaymentTokenResponse1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1
	 * IsabelLRCIExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Block of data on which the signature is calculated by the LRCI client."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelLRCIExtension1, IsabelEpaymentTokenResponse1> mmTokenResponse = new MMMessageAssociationEnd<IsabelLRCIExtension1, IsabelEpaymentTokenResponse1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelLRCIExtension1.mmObject();
			isDerived = false;
			xmlTag = "TknRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenResponse";
			definition = "Block of data on which the signature is calculated by the LRCI client.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelEpaymentTokenResponse1.mmObject();
		}

		@Override
		public IsabelEpaymentTokenResponse1 getValue(IsabelLRCIExtension1 obj) {
			return obj.getTokenResponse();
		}

		@Override
		public void setValue(IsabelLRCIExtension1 obj, IsabelEpaymentTokenResponse1 value) {
			obj.setTokenResponse(value);
		}
	};
	@XmlElement(name = "TknRspnPmtInfIndx", required = true)
	protected PositiveNumber tokenResponsePaymentInformationIndex;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PositiveNumber
	 * PositiveNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1
	 * IsabelLRCIExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknRspnPmtInfIndx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenResponsePaymentInformationIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index of the payment information element containing the hash of the visual representation and the hash of the payment file relevant for this signature."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelLRCIExtension1, PositiveNumber> mmTokenResponsePaymentInformationIndex = new MMMessageAttribute<IsabelLRCIExtension1, PositiveNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelLRCIExtension1.mmObject();
			isDerived = false;
			xmlTag = "TknRspnPmtInfIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenResponsePaymentInformationIndex";
			definition = "Index of the payment information element containing the hash of the visual representation and the hash of the payment file relevant for this signature.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositiveNumber.mmObject();
		}

		@Override
		public PositiveNumber getValue(IsabelLRCIExtension1 obj) {
			return obj.getTokenResponsePaymentInformationIndex();
		}

		@Override
		public void setValue(IsabelLRCIExtension1 obj, PositiveNumber value) {
			obj.setTokenResponsePaymentInformationIndex(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelLRCIExtension1.mmImageHashAlgorithm, com.tools20022.repository.msg.IsabelLRCIExtension1.mmTokenResponse,
						com.tools20022.repository.msg.IsabelLRCIExtension1.mmTokenResponsePaymentInformationIndex);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelLRCIExtension1";
				definition = "Specifies the LRCI protocol extension details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max105Text getImageHashAlgorithm() {
		return imageHashAlgorithm;
	}

	public IsabelLRCIExtension1 setImageHashAlgorithm(Max105Text imageHashAlgorithm) {
		this.imageHashAlgorithm = Objects.requireNonNull(imageHashAlgorithm);
		return this;
	}

	public IsabelEpaymentTokenResponse1 getTokenResponse() {
		return tokenResponse;
	}

	public IsabelLRCIExtension1 setTokenResponse(IsabelEpaymentTokenResponse1 tokenResponse) {
		this.tokenResponse = Objects.requireNonNull(tokenResponse);
		return this;
	}

	public PositiveNumber getTokenResponsePaymentInformationIndex() {
		return tokenResponsePaymentInformationIndex;
	}

	public IsabelLRCIExtension1 setTokenResponsePaymentInformationIndex(PositiveNumber tokenResponsePaymentInformationIndex) {
		this.tokenResponsePaymentInformationIndex = Objects.requireNonNull(tokenResponsePaymentInformationIndex);
		return this;
	}
}