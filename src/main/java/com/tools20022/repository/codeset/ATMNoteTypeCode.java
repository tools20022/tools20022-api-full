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
import com.tools20022.repository.codeset.ATMNoteTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of items the cash-in cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#All
 * ATMNoteTypeCode.All}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Counterfeit
 * ATMNoteTypeCode.Counterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Individual
 * ATMNoteTypeCode.Individual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#SuspectedCounterfeit
 * ATMNoteTypeCode.SuspectedCounterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Unfit
 * ATMNoteTypeCode.Unfit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Fit
 * ATMNoteTypeCode.Fit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#FitAndUnfit
 * ATMNoteTypeCode.FitAndUnfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Neutralised
 * ATMNoteTypeCode.Neutralised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Suspect
 * ATMNoteTypeCode.Suspect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#Unrecognised
 * ATMNoteTypeCode.Unrecognised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType1Code
 * ATMNoteType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
 * ATMNoteType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMNoteTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of items the cash-in cassette."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMNoteTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All fit bank note types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All fit bank note types."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode All = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "All fit bank note types.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "ALLT";
		}
	};
	/**
	 * Detected counterfeit notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detected counterfeit notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Counterfeit = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterfeit";
			definition = "Detected counterfeit notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "CNTR";
		}
	};
	/**
	 * All types of fit bank notes specified in an individual list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDVD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All types of fit bank notes specified in an individual list."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Individual = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Individual";
			definition = "All types of fit bank notes specified in an individual list.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "IDVD";
		}
	};
	/**
	 * Suspected counterfeit notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCNT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspected counterfeit notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode SuspectedCounterfeit = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeit";
			definition = "Suspected counterfeit notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "SCNT";
		}
	};
	/**
	 * Unfit bank notes (unacceptable quality).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNFT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unfit bank notes (unacceptable quality)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Unfit = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfit";
			definition = "Unfit bank notes (unacceptable quality).";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "UNFT";
		}
	};
	/**
	 * Fit bank notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FITN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fit bank notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Fit = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fit";
			definition = "Fit bank notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "FITN";
		}
	};
	/**
	 * Fit and unfit bank notes, if fitness cannot be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FITU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FitAndUnfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fit and unfit bank notes, if fitness cannot be determined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode FitAndUnfit = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FitAndUnfit";
			definition = "Fit and unfit bank notes, if fitness cannot be determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "FITU";
		}
	};
	/**
	 * Notes stained by dye pack.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NTRL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Neutralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notes stained by dye pack."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Neutralised = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Neutralised";
			definition = "Notes stained by dye pack.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "NTRL";
		}
	};
	/**
	 * Suspect notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspect notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Suspect = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspect";
			definition = "Suspect notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "SPCT";
		}
	};
	/**
	 * Unrecognised notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode
	 * ATMNoteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unrecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMNoteTypeCode Unrecognised = new ATMNoteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrecognised";
			definition = "Unrecognised notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMNoteTypeCode.mmObject();
			codeName = "UNRG";
		}
	};
	final static private LinkedHashMap<String, ATMNoteTypeCode> codesByName = new LinkedHashMap<>();

	protected ATMNoteTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMNoteTypeCode";
				definition = "Type of items the cash-in cassette.";
				derivation_lazy = () -> Arrays.asList(ATMNoteType1Code.mmObject(), ATMNoteType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMNoteTypeCode.All, com.tools20022.repository.codeset.ATMNoteTypeCode.Counterfeit, com.tools20022.repository.codeset.ATMNoteTypeCode.Individual,
						com.tools20022.repository.codeset.ATMNoteTypeCode.SuspectedCounterfeit, com.tools20022.repository.codeset.ATMNoteTypeCode.Unfit, com.tools20022.repository.codeset.ATMNoteTypeCode.Fit,
						com.tools20022.repository.codeset.ATMNoteTypeCode.FitAndUnfit, com.tools20022.repository.codeset.ATMNoteTypeCode.Neutralised, com.tools20022.repository.codeset.ATMNoteTypeCode.Suspect,
						com.tools20022.repository.codeset.ATMNoteTypeCode.Unrecognised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(Counterfeit.getCodeName().get(), Counterfeit);
		codesByName.put(Individual.getCodeName().get(), Individual);
		codesByName.put(SuspectedCounterfeit.getCodeName().get(), SuspectedCounterfeit);
		codesByName.put(Unfit.getCodeName().get(), Unfit);
		codesByName.put(Fit.getCodeName().get(), Fit);
		codesByName.put(FitAndUnfit.getCodeName().get(), FitAndUnfit);
		codesByName.put(Neutralised.getCodeName().get(), Neutralised);
		codesByName.put(Suspect.getCodeName().get(), Suspect);
		codesByName.put(Unrecognised.getCodeName().get(), Unrecognised);
	}

	public static ATMNoteTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMNoteTypeCode[] values() {
		ATMNoteTypeCode[] values = new ATMNoteTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMNoteTypeCode> {
		@Override
		public ATMNoteTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMNoteTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}