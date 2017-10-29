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
import com.tools20022.repository.datatype.Max50Binary;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a record holding the LRCI required data related to a payment file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelLRCIPaymentInformation1#ImageHash
 * IsabelLRCIPaymentInformation1.ImageHash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelLRCIPaymentInformation1#PaymentHash
 * IsabelLRCIPaymentInformation1.PaymentHash}</li>
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
 * "IsabelLRCIPaymentInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a record holding the LRCI required data related to a payment file."
 * </li>
 * </ul>
 */
public class IsabelLRCIPaymentInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Arbitrary block of data defined as a fixed-size bit string, the
	 * (cryptographic) hash value, which allows the detection of an accidental
	 * or intentional change to the visual representation of a particular
	 * payment file.
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
	 * {@linkplain com.tools20022.repository.msg.IsabelLRCIPaymentInformation1
	 * IsabelLRCIPaymentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImgHash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImageHash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Arbitrary block of data defined as a fixed-size bit string, the (cryptographic) hash value, which allows the detection of an accidental or intentional change to the  visual representation of a particular payment file."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ImageHash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelLRCIPaymentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ImgHash";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImageHash";
			definition = "Arbitrary block of data defined as a fixed-size bit string, the (cryptographic) hash value, which allows the detection of an accidental or intentional change to the  visual representation of a particular payment file.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max50Binary.mmObject();
		}
	};
	/**
	 * Arbitrary block of data defined as a fixed-size bit string, the
	 * (cryptographic) hash value, which allows the detection of an accidental
	 * or intentional change to a particular payment file.
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
	 * {@linkplain com.tools20022.repository.msg.IsabelLRCIPaymentInformation1
	 * IsabelLRCIPaymentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtHash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentHash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Arbitrary block of data defined as a fixed-size bit string, the (cryptographic) hash value, which allows the detection of an accidental or intentional change to a particular payment file."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentHash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelLRCIPaymentInformation1.mmObject();
			isDerived = false;
			xmlTag = "PmtHash";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentHash";
			definition = "Arbitrary block of data defined as a fixed-size bit string, the (cryptographic) hash value, which allows the detection of an accidental or intentional change to a particular payment file.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max50Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelLRCIPaymentInformation1.ImageHash, com.tools20022.repository.msg.IsabelLRCIPaymentInformation1.PaymentHash);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelLRCIPaymentInformation1";
				definition = "Specifies a record holding the LRCI required data related to a payment file.";
			}
		});
		return mmObject_lazy.get();
	}
}