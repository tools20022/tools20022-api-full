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
import com.tools20022.repository.codeset.ATMNoteType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of notes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#Counterfeit
 * ATMNoteType2Code.Counterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#Fit
 * ATMNoteType2Code.Fit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#FitAndUnfit
 * ATMNoteType2Code.FitAndUnfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#Neutralised
 * ATMNoteType2Code.Neutralised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#Suspect
 * ATMNoteType2Code.Suspect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#Unfit
 * ATMNoteType2Code.Unfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code#Unrecognised
 * ATMNoteType2Code.Unrecognised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
 * ATMNoteTypeCode}</li>
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
 * "ATMNoteType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of notes."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMNoteType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterfeit"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code Counterfeit = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterfeit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.Counterfeit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fit"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code Fit = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.Fit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FitAndUnfit"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code FitAndUnfit = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FitAndUnfit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.FitAndUnfit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Neutralised"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code Neutralised = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Neutralised";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.Neutralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspect"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code Suspect = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspect";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.Suspect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfit"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code Unfit = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.Unfit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
	 * ATMNoteType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unrecognised"</li>
	 * </ul>
	 */
	public static final ATMNoteType2Code Unrecognised = new ATMNoteType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrecognised";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteType2Code.mmObject();
			codeName = ATMNoteTypeCode.Unrecognised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMNoteType2Code> codesByName = new LinkedHashMap<>();

	protected ATMNoteType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMNoteType2Code";
				definition = "Type of notes.";
				trace_lazy = () -> ATMNoteTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMNoteType2Code.Counterfeit, com.tools20022.repository.codeset.ATMNoteType2Code.Fit, com.tools20022.repository.codeset.ATMNoteType2Code.FitAndUnfit,
						com.tools20022.repository.codeset.ATMNoteType2Code.Neutralised, com.tools20022.repository.codeset.ATMNoteType2Code.Suspect, com.tools20022.repository.codeset.ATMNoteType2Code.Unfit,
						com.tools20022.repository.codeset.ATMNoteType2Code.Unrecognised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Counterfeit.getCodeName().get(), Counterfeit);
		codesByName.put(Fit.getCodeName().get(), Fit);
		codesByName.put(FitAndUnfit.getCodeName().get(), FitAndUnfit);
		codesByName.put(Neutralised.getCodeName().get(), Neutralised);
		codesByName.put(Suspect.getCodeName().get(), Suspect);
		codesByName.put(Unfit.getCodeName().get(), Unfit);
		codesByName.put(Unrecognised.getCodeName().get(), Unrecognised);
	}

	public static ATMNoteType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMNoteType2Code[] values() {
		ATMNoteType2Code[] values = new ATMNoteType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMNoteType2Code> {
		@Override
		public ATMNoteType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMNoteType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}