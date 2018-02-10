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
import com.tools20022.repository.codeset.CheckCodeLine1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Format of the check code line.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code#CMC7
 * CheckCodeLine1Code.CMC7}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code#E13B
 * CheckCodeLine1Code.E13B}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code#OCRA
 * CheckCodeLine1Code.OCRA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code#OCRB
 * CheckCodeLine1Code.OCRB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code#OCRDefault
 * CheckCodeLine1Code.OCRDefault}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode
 * CheckCodeLineCode}</li>
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
 * "CheckCodeLine1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Format of the check code line."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CheckCodeLine1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
	 * CheckCodeLine1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMC7"</li>
	 * </ul>
	 */
	public static final CheckCodeLine1Code CMC7 = new CheckCodeLine1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMC7";
			owner_lazy = () -> com.tools20022.repository.codeset.CheckCodeLine1Code.mmObject();
			codeName = CheckCodeLineCode.CMC7.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
	 * CheckCodeLine1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "E13B"</li>
	 * </ul>
	 */
	public static final CheckCodeLine1Code E13B = new CheckCodeLine1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "E13B";
			owner_lazy = () -> com.tools20022.repository.codeset.CheckCodeLine1Code.mmObject();
			codeName = CheckCodeLineCode.E13B.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
	 * CheckCodeLine1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OCRA"</li>
	 * </ul>
	 */
	public static final CheckCodeLine1Code OCRA = new CheckCodeLine1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OCRA";
			owner_lazy = () -> com.tools20022.repository.codeset.CheckCodeLine1Code.mmObject();
			codeName = CheckCodeLineCode.OCRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
	 * CheckCodeLine1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OCRB"</li>
	 * </ul>
	 */
	public static final CheckCodeLine1Code OCRB = new CheckCodeLine1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OCRB";
			owner_lazy = () -> com.tools20022.repository.codeset.CheckCodeLine1Code.mmObject();
			codeName = CheckCodeLineCode.OCRB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
	 * CheckCodeLine1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OCRDefault"</li>
	 * </ul>
	 */
	public static final CheckCodeLine1Code OCRDefault = new CheckCodeLine1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OCRDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.CheckCodeLine1Code.mmObject();
			codeName = CheckCodeLineCode.OCRDefault.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CheckCodeLine1Code> codesByName = new LinkedHashMap<>();

	protected CheckCodeLine1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CheckCodeLine1Code";
				definition = "Format of the check code line.";
				trace_lazy = () -> CheckCodeLineCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CheckCodeLine1Code.CMC7, com.tools20022.repository.codeset.CheckCodeLine1Code.E13B, com.tools20022.repository.codeset.CheckCodeLine1Code.OCRA,
						com.tools20022.repository.codeset.CheckCodeLine1Code.OCRB, com.tools20022.repository.codeset.CheckCodeLine1Code.OCRDefault);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CMC7.getCodeName().get(), CMC7);
		codesByName.put(E13B.getCodeName().get(), E13B);
		codesByName.put(OCRA.getCodeName().get(), OCRA);
		codesByName.put(OCRB.getCodeName().get(), OCRB);
		codesByName.put(OCRDefault.getCodeName().get(), OCRDefault);
	}

	public static CheckCodeLine1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CheckCodeLine1Code[] values() {
		CheckCodeLine1Code[] values = new CheckCodeLine1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CheckCodeLine1Code> {
		@Override
		public CheckCodeLine1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CheckCodeLine1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}