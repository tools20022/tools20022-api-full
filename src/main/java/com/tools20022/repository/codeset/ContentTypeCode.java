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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of the type of protection for a protected data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentTypeCode#PlainData
 * ContentTypeCode.PlainData}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentTypeCode#SignedData
 * ContentTypeCode.SignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode#EnvelopedData
 * ContentTypeCode.EnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode#DigestedData
 * ContentTypeCode.DigestedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode#EncryptedData
 * ContentTypeCode.EncryptedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode#AuthenticatedData
 * ContentTypeCode.AuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentType1Code
 * ContentType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ContentType2Code
 * ContentType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DATA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the type of protection for a protected data."</li>
 * </ul>
 */
public class ContentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Generic, non cryptographic, or unqualified data content - (ASN.1 Object
	 * Identifier: id-data).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
	 * ContentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DATA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PlainData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlainData";
			definition = "Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).";
			owner_lazy = () -> ContentTypeCode.mmObject();
			codeName = "DATA";
		}
	};
	/**
	 * Digital signature - (ASN.1 Object Identifier: id-signedData).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
	 * ContentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature - (ASN.1 Object Identifier: id-signedData)."</li>
	 * </ul>
	 */
	public static final MMCode SignedData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignedData";
			definition = "Digital signature - (ASN.1 Object Identifier: id-signedData).";
			owner_lazy = () -> ContentTypeCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Encrypted data, with encryption key - (ASN.1 Object Identifier:
	 * id-envelopedData).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
	 * ContentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EVLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode EnvelopedData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EnvelopedData";
			definition = "Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).";
			owner_lazy = () -> ContentTypeCode.mmObject();
			codeName = "EVLP";
		}
	};
	/**
	 * Message digest - (ASN.1 Object Identifier: id-digestedData).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
	 * ContentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message digest - (ASN.1 Object Identifier: id-digestedData)."</li>
	 * </ul>
	 */
	public static final MMCode DigestedData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DigestedData";
			definition = "Message digest - (ASN.1 Object Identifier: id-digestedData).";
			owner_lazy = () -> ContentTypeCode.mmObject();
			codeName = "DGST";
		}
	};
	/**
	 * Encrypted data - (ASN.1 Object Identifier: id-encryptedData).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
	 * ContentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted data - (ASN.1 Object Identifier: id-encryptedData)."</li>
	 * </ul>
	 */
	public static final MMCode EncryptedData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EncryptedData";
			definition = "Encrypted data - (ASN.1 Object Identifier: id-encryptedData).";
			owner_lazy = () -> ContentTypeCode.mmObject();
			codeName = "ECRP";
		}
	};
	/**
	 * MAC (Message Authentication Code), with encryption key - (ASN.1 Object
	 * Identifier: id-ct-authData).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ContentTypeCode
	 * ContentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AuthenticatedData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthenticatedData";
			definition = "MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).";
			owner_lazy = () -> ContentTypeCode.mmObject();
			codeName = "AUTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DATA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContentTypeCode";
				definition = "Identification of the type of protection for a protected data.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ContentTypeCode.PlainData, com.tools20022.repository.codeset.ContentTypeCode.SignedData, com.tools20022.repository.codeset.ContentTypeCode.EnvelopedData,
						com.tools20022.repository.codeset.ContentTypeCode.DigestedData, com.tools20022.repository.codeset.ContentTypeCode.EncryptedData, com.tools20022.repository.codeset.ContentTypeCode.AuthenticatedData);
				derivation_lazy = () -> Arrays.asList(ContentType1Code.mmObject(), ContentType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}