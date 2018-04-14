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
import com.tools20022.repository.codeset.EncryptionFormat2Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code#TR31
 * EncryptionFormat2Code.TR31}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code#TR34
 * EncryptionFormat2Code.TR34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code#ISO20038KeyWrap
 * EncryptionFormat2Code.ISO20038KeyWrap}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EncryptionFormat2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Format of data before encryption, if the format is not plaintext or implicit."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code
 * EncryptionFormat1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EncryptionFormat2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code
	 * EncryptionFormat2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR31"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code#TR31
	 * EncryptionFormat1Code.TR31}</li>
	 * </ul>
	 */
	public static final EncryptionFormat2Code TR31 = new EncryptionFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR31";
			previousVersion_lazy = () -> EncryptionFormat1Code.TR31;
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormat2Code.mmObject();
			codeName = EncryptionFormatCode.TR31.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code
	 * EncryptionFormat2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR34"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code#TR34
	 * EncryptionFormat1Code.TR34}</li>
	 * </ul>
	 */
	public static final EncryptionFormat2Code TR34 = new EncryptionFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR34";
			previousVersion_lazy = () -> EncryptionFormat1Code.TR34;
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormat2Code.mmObject();
			codeName = EncryptionFormatCode.TR34.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code
	 * EncryptionFormat2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO20038KeyWrap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final EncryptionFormat2Code ISO20038KeyWrap = new EncryptionFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO20038KeyWrap";
			owner_lazy = () -> com.tools20022.repository.codeset.EncryptionFormat2Code.mmObject();
			codeName = EncryptionFormatCode.ISO20038KeyWrap.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EncryptionFormat2Code> codesByName = new LinkedHashMap<>();

	protected EncryptionFormat2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EncryptionFormat2Code";
				definition = "Format of data before encryption, if the format is not plaintext or implicit.";
				previousVersion_lazy = () -> EncryptionFormat1Code.mmObject();
				trace_lazy = () -> EncryptionFormatCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EncryptionFormat2Code.TR31, com.tools20022.repository.codeset.EncryptionFormat2Code.TR34,
						com.tools20022.repository.codeset.EncryptionFormat2Code.ISO20038KeyWrap);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TR31.getCodeName().get(), TR31);
		codesByName.put(TR34.getCodeName().get(), TR34);
		codesByName.put(ISO20038KeyWrap.getCodeName().get(), ISO20038KeyWrap);
	}

	public static EncryptionFormat2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EncryptionFormat2Code[] values() {
		EncryptionFormat2Code[] values = new EncryptionFormat2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EncryptionFormat2Code> {
		@Override
		public EncryptionFormat2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EncryptionFormat2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}