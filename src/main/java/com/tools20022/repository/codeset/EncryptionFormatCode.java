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
import com.tools20022.repository.codeset.EncryptionFormatCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Format of data before encryption, if the format is not plaintext or implicit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormatCode#TR31
 * EncryptionFormatCode.TR31}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormatCode#TR34
 * EncryptionFormatCode.TR34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EncryptionFormatCode#ISO20038KeyWrap
 * EncryptionFormatCode.ISO20038KeyWrap}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code
 * EncryptionFormat1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code
 * EncryptionFormat2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EncryptionFormatCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Format of data before encryption, if the format is not plaintext or implicit."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TR31"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EncryptionFormatCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Format of a cryptographic key specified by the ANSI X9 TR-31 standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormatCode
	 * EncryptionFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TR31"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR31"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of a cryptographic key specified by the ANSI X9 TR-31 standard."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EncryptionFormatCode TR31 = new EncryptionFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR31";
			definition = "Format of a cryptographic key specified by the ANSI X9 TR-31 standard.";
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormatCode.mmObject();
			codeName = "TR31";
		}
	};
	/**
	 * Format of a cryptographic key specified by the ANSI X9 TR-34 standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormatCode
	 * EncryptionFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TR34"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR34"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of a cryptographic key specified by the ANSI X9 TR-34 standard."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EncryptionFormatCode TR34 = new EncryptionFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR34";
			definition = "Format of a cryptographic key specified by the ANSI X9 TR-34 standard.";
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormatCode.mmObject();
			codeName = "TR34";
		}
	};
	/**
	 * Format of a cryptographic key specified by the ISO20038 standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormatCode
	 * EncryptionFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "I238"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO20038KeyWrap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of a cryptographic key specified by the ISO20038 standard."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EncryptionFormatCode ISO20038KeyWrap = new EncryptionFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO20038KeyWrap";
			definition = "Format of a cryptographic key specified by the ISO20038 standard.";
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormatCode.mmObject();
			codeName = "I238";
		}
	};
	final static private LinkedHashMap<String, EncryptionFormatCode> codesByName = new LinkedHashMap<>();

	protected EncryptionFormatCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TR31");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EncryptionFormatCode";
				definition = "Format of data before encryption, if the format is not plaintext or implicit.";
				derivation_lazy = () -> Arrays.asList(EncryptionFormat1Code.mmObject(), EncryptionFormat2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EncryptionFormatCode.TR31, com.tools20022.repository.codeset.EncryptionFormatCode.TR34,
						com.tools20022.repository.codeset.EncryptionFormatCode.ISO20038KeyWrap);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TR31.getCodeName().get(), TR31);
		codesByName.put(TR34.getCodeName().get(), TR34);
		codesByName.put(ISO20038KeyWrap.getCodeName().get(), ISO20038KeyWrap);
	}

	public static EncryptionFormatCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EncryptionFormatCode[] values() {
		EncryptionFormatCode[] values = new EncryptionFormatCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EncryptionFormatCode> {
		@Override
		public EncryptionFormatCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EncryptionFormatCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}