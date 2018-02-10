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
import com.tools20022.repository.codeset.InputSourceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the input source for the generation of the file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InputSourceCode#Encoded
 * InputSourceCode.Encoded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InputSourceCode#UploadedViaCIS
 * InputSourceCode.UploadedViaCIS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InputSourceCode#UploadedManually
 * InputSourceCode.UploadedManually}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InputSource1Code
 * InputSource1Code}</li>
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
 * "InputSourceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the input source for the generation of the file."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InputSourceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * File has been encoded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InputSourceCode
	 * InputSourceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Encoded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File has been encoded."</li>
	 * </ul>
	 */
	public static final InputSourceCode Encoded = new InputSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Encoded";
			definition = "File has been encoded.";
			owner_lazy = () -> com.tools20022.repository.codeset.InputSourceCode.mmObject();
			codeName = "NCOD";
		}
	};
	/**
	 * File has been uploaded through the CIS (Customer Identification System)
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InputSourceCode
	 * InputSourceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UploadedViaCIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File has been uploaded through the CIS (Customer Identification System) system."
	 * </li>
	 * </ul>
	 */
	public static final InputSourceCode UploadedViaCIS = new InputSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UploadedViaCIS";
			definition = "File has been uploaded through the CIS (Customer Identification System) system.";
			owner_lazy = () -> com.tools20022.repository.codeset.InputSourceCode.mmObject();
			codeName = "UCIS";
		}
	};
	/**
	 * File has been uploaded manually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InputSourceCode
	 * InputSourceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UMNL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UploadedManually"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File has been uploaded manually."</li>
	 * </ul>
	 */
	public static final InputSourceCode UploadedManually = new InputSourceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UploadedManually";
			definition = "File has been uploaded manually.";
			owner_lazy = () -> com.tools20022.repository.codeset.InputSourceCode.mmObject();
			codeName = "UMNL";
		}
	};
	final static private LinkedHashMap<String, InputSourceCode> codesByName = new LinkedHashMap<>();

	protected InputSourceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InputSourceCode";
				definition = "Specifies the input source for the generation of the file.";
				derivation_lazy = () -> Arrays.asList(InputSource1Code.mmObject());
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.InputSourceCode.Encoded, com.tools20022.repository.codeset.InputSourceCode.UploadedViaCIS, com.tools20022.repository.codeset.InputSourceCode.UploadedManually);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Encoded.getCodeName().get(), Encoded);
		codesByName.put(UploadedViaCIS.getCodeName().get(), UploadedViaCIS);
		codesByName.put(UploadedManually.getCodeName().get(), UploadedManually);
	}

	public static InputSourceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InputSourceCode[] values() {
		InputSourceCode[] values = new InputSourceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InputSourceCode> {
		@Override
		public InputSourceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InputSourceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}