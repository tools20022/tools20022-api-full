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
import com.tools20022.repository.codeset.TechnicalValidationStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the result of the technical validation carried out by the receiver
 * (forwarding or first agent).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatus1Code#ReceptionConfirmation
 * TechnicalValidationStatus1Code.ReceptionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatus1Code#ReceptionError
 * TechnicalValidationStatus1Code.ReceptionError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatusCode
 * TechnicalValidationStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RCCF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TechnicalValidationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the result of the technical validation carried out by the receiver (forwarding or first agent)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TechnicalValidationStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatus1Code
	 * TechnicalValidationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceptionConfirmation"</li>
	 * </ul>
	 */
	public static final TechnicalValidationStatus1Code ReceptionConfirmation = new TechnicalValidationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceptionConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.TechnicalValidationStatus1Code.mmObject();
			codeName = TechnicalValidationStatusCode.ReceptionConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatus1Code
	 * TechnicalValidationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceptionError"</li>
	 * </ul>
	 */
	public static final TechnicalValidationStatus1Code ReceptionError = new TechnicalValidationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceptionError";
			owner_lazy = () -> com.tools20022.repository.codeset.TechnicalValidationStatus1Code.mmObject();
			codeName = TechnicalValidationStatusCode.ReceptionError.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TechnicalValidationStatus1Code> codesByName = new LinkedHashMap<>();

	protected TechnicalValidationStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RCCF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TechnicalValidationStatus1Code";
				definition = "Specifies the result of the technical validation carried out by the receiver (forwarding or first agent).";
				trace_lazy = () -> TechnicalValidationStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TechnicalValidationStatus1Code.ReceptionConfirmation, com.tools20022.repository.codeset.TechnicalValidationStatus1Code.ReceptionError);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReceptionConfirmation.getCodeName().get(), ReceptionConfirmation);
		codesByName.put(ReceptionError.getCodeName().get(), ReceptionError);
	}

	public static TechnicalValidationStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TechnicalValidationStatus1Code[] values() {
		TechnicalValidationStatus1Code[] values = new TechnicalValidationStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TechnicalValidationStatus1Code> {
		@Override
		public TechnicalValidationStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TechnicalValidationStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}