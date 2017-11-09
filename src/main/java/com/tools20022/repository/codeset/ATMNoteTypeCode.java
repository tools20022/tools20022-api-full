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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of items the cash-in cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType1Code
 * ATMNoteType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteType2Code
 * ATMNoteType2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmAll
 * ATMNoteTypeCode.mmAll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmCounterfeit
 * ATMNoteTypeCode.mmCounterfeit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmIndividual
 * ATMNoteTypeCode.mmIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmSuspectedCounterfeit
 * ATMNoteTypeCode.mmSuspectedCounterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmUnfit
 * ATMNoteTypeCode.mmUnfit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmFit
 * ATMNoteTypeCode.mmFit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmFitAndUnfit
 * ATMNoteTypeCode.mmFitAndUnfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmNeutralised
 * ATMNoteTypeCode.mmNeutralised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmSuspect
 * ATMNoteTypeCode.mmSuspect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMNoteTypeCode#mmUnrecognised
 * ATMNoteTypeCode.mmUnrecognised}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMNoteTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of items the cash-in cassette."</li>
 * </ul>
 */
public class ATMNoteTypeCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All fit bank note types."</li>
	 * </ul>
	 */
	public static final MMCode mmAll = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "All fit bank note types.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detected counterfeit notes."</li>
	 * </ul>
	 */
	public static final MMCode mmCounterfeit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterfeit";
			definition = "Detected counterfeit notes.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All types of fit bank notes specified in an individual list."</li>
	 * </ul>
	 */
	public static final MMCode mmIndividual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Individual";
			definition = "All types of fit bank notes specified in an individual list.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspected counterfeit notes."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedCounterfeit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeit";
			definition = "Suspected counterfeit notes.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unfit bank notes (unacceptable quality)."</li>
	 * </ul>
	 */
	public static final MMCode mmUnfit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfit";
			definition = "Unfit bank notes (unacceptable quality).";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fit bank notes."</li>
	 * </ul>
	 */
	public static final MMCode mmFit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fit";
			definition = "Fit bank notes.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FitAndUnfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fit and unfit bank notes, if fitness cannot be determined."</li>
	 * </ul>
	 */
	public static final MMCode mmFitAndUnfit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FitAndUnfit";
			definition = "Fit and unfit bank notes, if fitness cannot be determined.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Neutralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notes stained by dye pack."</li>
	 * </ul>
	 */
	public static final MMCode mmNeutralised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Neutralised";
			definition = "Notes stained by dye pack.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspect notes."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspect = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspect";
			definition = "Suspect notes.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unrecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised notes."</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrecognised";
			definition = "Unrecognised notes.";
			owner_lazy = () -> ATMNoteTypeCode.mmObject();
			codeName = "UNRG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMNoteTypeCode";
				definition = "Type of items the cash-in cassette.";
				code_lazy = () -> Arrays.asList(ATMNoteTypeCode.mmAll, ATMNoteTypeCode.mmCounterfeit, ATMNoteTypeCode.mmIndividual, ATMNoteTypeCode.mmSuspectedCounterfeit, ATMNoteTypeCode.mmUnfit, ATMNoteTypeCode.mmFit,
						ATMNoteTypeCode.mmFitAndUnfit, ATMNoteTypeCode.mmNeutralised, ATMNoteTypeCode.mmSuspect, ATMNoteTypeCode.mmUnrecognised);
				derivation_lazy = () -> Arrays.asList(ATMNoteType1Code.mmObject(), ATMNoteType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}