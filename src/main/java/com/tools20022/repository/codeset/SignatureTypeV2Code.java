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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SignatureTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code#Original
 * SignatureTypeV2Code.Original}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code#Digital
 * SignatureTypeV2Code.Digital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code#Electronic
 * SignatureTypeV2Code.Electronic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code#None
 * SignatureTypeV2Code.None}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SignatureType2Code
 * SignatureType2Code}</li>
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
 * "SignatureTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of signature."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SignatureTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Written signature. May also be known as a physical or wet signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code
	 * SignatureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Original"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written signature. May also be known as a physical or wet signature."</li>
	 * </ul>
	 */
	public static final SignatureTypeV2Code Original = new SignatureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Original";
			definition = "Written signature. May also be known as a physical or wet signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeV2Code.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Technical signature that includes algorithms and private key and public
	 * key information. Used to sign and verify the contents of a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code
	 * SignatureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message."
	 * </li>
	 * </ul>
	 */
	public static final SignatureTypeV2Code Digital = new SignatureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digital";
			definition = "Technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeV2Code.mmObject();
			codeName = "DIGI";
		}
	};
	/**
	 * Copy of a physical or original signature in an electronic format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code
	 * SignatureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Copy of a physical or original signature in an electronic format."</li>
	 * </ul>
	 */
	public static final SignatureTypeV2Code Electronic = new SignatureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			definition = "Copy of a physical or original signature in an electronic format.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeV2Code.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * No signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeV2Code
	 * SignatureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No signature."</li>
	 * </ul>
	 */
	public static final SignatureTypeV2Code None = new SignatureTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "No signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeV2Code.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, SignatureTypeV2Code> codesByName = new LinkedHashMap<>();

	protected SignatureTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureTypeV2Code";
				definition = "Type of signature.";
				derivation_lazy = () -> Arrays.asList(SignatureType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SignatureTypeV2Code.Original, com.tools20022.repository.codeset.SignatureTypeV2Code.Digital,
						com.tools20022.repository.codeset.SignatureTypeV2Code.Electronic, com.tools20022.repository.codeset.SignatureTypeV2Code.None);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Original.getCodeName().get(), Original);
		codesByName.put(Digital.getCodeName().get(), Digital);
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(None.getCodeName().get(), None);
	}

	public static SignatureTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SignatureTypeV2Code[] values() {
		SignatureTypeV2Code[] values = new SignatureTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SignatureTypeV2Code> {
		@Override
		public SignatureTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SignatureTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}