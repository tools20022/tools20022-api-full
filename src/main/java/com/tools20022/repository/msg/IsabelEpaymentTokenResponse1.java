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
import com.tools20022.repository.datatype.Max1kBinary;
import com.tools20022.repository.datatype.Max50Binary;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the token data on which the signature is calculated by the LRCI
 * client.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1#LRCITransactionIdentification
 * IsabelEpaymentTokenResponse1.LRCITransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1#PaymentInformation
 * IsabelEpaymentTokenResponse1.PaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1#ServerSignature
 * IsabelEpaymentTokenResponse1.ServerSignature}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelEpaymentTokenResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the token data on which the signature is calculated by the LRCI client."
 * </li>
 * </ul>
 */
public class IsabelEpaymentTokenResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous transaction identification of the group of signed
	 * payment files.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Binary
	 * Max50Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1
	 * IsabelEpaymentTokenResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LRCITxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LRCITransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous transaction identification of the group of signed payment files."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute LRCITransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEpaymentTokenResponse1.mmObject();
			isDerived = false;
			xmlTag = "LRCITxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LRCITransactionIdentification";
			definition = "Unique and unambiguous transaction identification of the group of signed payment files.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max50Binary.mmObject();
		}
	};
	/**
	 * Individual record holding all data related to a payment file that is
	 * being used during the signature process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IsabelLRCIPaymentInformation1
	 * IsabelLRCIPaymentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1
	 * IsabelEpaymentTokenResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual record holding all data related to a payment file that is being used during the signature process."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelEpaymentTokenResponse1.mmObject();
			isDerived = false;
			xmlTag = "PmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Individual record holding all data related to a payment file that is being used during the signature process.";
			minOccurs = 1;
			maxOccurs = 100;
			type_lazy = () -> IsabelLRCIPaymentInformation1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Mathematical scheme for demonstrating the authenticity of the original
	 * server challenge exchanged by the LRCI protocol during the signature
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1kBinary
	 * Max1kBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelEpaymentTokenResponse1
	 * IsabelEpaymentTokenResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mathematical scheme for demonstrating the authenticity of the original server challenge exchanged by the LRCI protocol during the signature process."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ServerSignature = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelEpaymentTokenResponse1.mmObject();
			isDerived = false;
			xmlTag = "SvrSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerSignature";
			definition = "Mathematical scheme for demonstrating the authenticity of the original server challenge exchanged by the LRCI protocol during the signature process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1kBinary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelEpaymentTokenResponse1.LRCITransactionIdentification, com.tools20022.repository.msg.IsabelEpaymentTokenResponse1.PaymentInformation,
						com.tools20022.repository.msg.IsabelEpaymentTokenResponse1.ServerSignature);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelEpaymentTokenResponse1";
				definition = "Specifies the token data on which the signature is calculated by the LRCI client.";
			}
		});
		return mmObject_lazy.get();
	}
}