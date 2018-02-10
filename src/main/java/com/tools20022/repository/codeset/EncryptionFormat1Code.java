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
import com.tools20022.repository.codeset.EncryptionFormat1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code#TR31
 * EncryptionFormat1Code.TR31}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code#TR34
 * EncryptionFormat1Code.TR34}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EncryptionFormatCode
 * EncryptionFormatCode}</li>
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
 * "EncryptionFormat1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Format of data before encryption, if the format is not plaintext or implicit."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code
 * EncryptionFormat2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EncryptionFormat1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code
	 * EncryptionFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR31"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code#TR31
	 * EncryptionFormat2Code.TR31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EncryptionFormat1Code TR31 = new EncryptionFormat1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR31";
			nextVersions_lazy = () -> Arrays.asList(EncryptionFormat2Code.TR31);
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormat1Code.mmObject();
			codeName = EncryptionFormatCode.TR31.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code
	 * EncryptionFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR34"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code#TR34
	 * EncryptionFormat2Code.TR34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EncryptionFormat1Code TR34 = new EncryptionFormat1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR34";
			nextVersions_lazy = () -> Arrays.asList(EncryptionFormat2Code.TR34);
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormat1Code.mmObject();
			codeName = EncryptionFormatCode.TR34.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EncryptionFormat1Code> codesByName = new LinkedHashMap<>();

	protected EncryptionFormat1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EncryptionFormat1Code";
				definition = "Format of data before encryption, if the format is not plaintext or implicit.";
				nextVersions_lazy = () -> Arrays.asList(EncryptionFormat2Code.mmObject());
				trace_lazy = () -> EncryptionFormatCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EncryptionFormat1Code.TR31, com.tools20022.repository.codeset.EncryptionFormat1Code.TR34);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TR31.getCodeName().get(), TR31);
		codesByName.put(TR34.getCodeName().get(), TR34);
	}

	public static EncryptionFormat1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EncryptionFormat1Code[] values() {
		EncryptionFormat1Code[] values = new EncryptionFormat1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EncryptionFormat1Code> {
		@Override
		public EncryptionFormat1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EncryptionFormat1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}