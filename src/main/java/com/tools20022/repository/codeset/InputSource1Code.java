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
import com.tools20022.repository.codeset.InputSource1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.InputSource1Code#Encoded
 * InputSource1Code.Encoded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InputSource1Code#UploadedManually
 * InputSource1Code.UploadedManually}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InputSource1Code#UploadedViaCIS
 * InputSource1Code.UploadedViaCIS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InputSourceCode
 * InputSourceCode}</li>
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
 * "InputSource1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the input source for the generation of the file."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InputSource1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InputSource1Code
	 * InputSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Encoded"</li>
	 * </ul>
	 */
	public static final InputSource1Code Encoded = new InputSource1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Encoded";
			owner_lazy = () -> com.tools20022.repository.codeset.InputSource1Code.mmObject();
			codeName = InputSourceCode.Encoded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InputSource1Code
	 * InputSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UploadedManually"</li>
	 * </ul>
	 */
	public static final InputSource1Code UploadedManually = new InputSource1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UploadedManually";
			owner_lazy = () -> com.tools20022.repository.codeset.InputSource1Code.mmObject();
			codeName = InputSourceCode.UploadedManually.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InputSource1Code
	 * InputSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UploadedViaCIS"</li>
	 * </ul>
	 */
	public static final InputSource1Code UploadedViaCIS = new InputSource1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UploadedViaCIS";
			owner_lazy = () -> com.tools20022.repository.codeset.InputSource1Code.mmObject();
			codeName = InputSourceCode.UploadedViaCIS.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InputSource1Code> codesByName = new LinkedHashMap<>();

	protected InputSource1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InputSource1Code";
				definition = "Specifies the input source for the generation of the file.";
				trace_lazy = () -> InputSourceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InputSource1Code.Encoded, com.tools20022.repository.codeset.InputSource1Code.UploadedManually,
						com.tools20022.repository.codeset.InputSource1Code.UploadedViaCIS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Encoded.getCodeName().get(), Encoded);
		codesByName.put(UploadedManually.getCodeName().get(), UploadedManually);
		codesByName.put(UploadedViaCIS.getCodeName().get(), UploadedViaCIS);
	}

	public static InputSource1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InputSource1Code[] values() {
		InputSource1Code[] values = new InputSource1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InputSource1Code> {
		@Override
		public InputSource1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InputSource1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}