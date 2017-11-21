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
 * Specifies the purpose of the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode#mmPrecalculated
 * ReportTypeCode.mmPrecalculated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportTypeCode#mmCurrent
 * ReportTypeCode.mmCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode#mmForwardInitialSubmission
 * ReportTypeCode.mmForwardInitialSubmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode#mmForwardReSubmission
 * ReportTypeCode.mmForwardReSubmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode#mmForwardAmend
 * ReportTypeCode.mmForwardAmend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportType2Code
 * ReportType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportType1Code
 * ReportType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PREC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the purpose of the report."</li>
 * </ul>
 */
public class ReportTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The report is precalculated. This type of report is sent when an
	 * amendment is proposed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode
	 * ReportTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Precalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The report is precalculated. This type of report is sent when an amendment is proposed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrecalculated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Precalculated";
			definition = "The report is precalculated. This type of report is sent when an amendment is proposed.";
			owner_lazy = () -> ReportTypeCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * The report is calculated on the basis of a dataset matched with a
	 * baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode
	 * ReportTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The report is calculated on the basis of a dataset matched with a baseline."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCurrent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			definition = "The report is calculated on the basis of a dataset matched with a baseline.";
			owner_lazy = () -> ReportTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * The report contains a baseline submitted for the first time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode
	 * ReportTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardInitialSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The report contains a baseline submitted for the first time."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardInitialSubmission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardInitialSubmission";
			definition = "The report contains a baseline submitted for the first time.";
			owner_lazy = () -> ReportTypeCode.mmObject();
			codeName = "FWIS";
		}
	};
	/**
	 * The report contains a baseline that is resubmitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode
	 * ReportTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardReSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The report contains a baseline that is resubmitted."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardReSubmission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardReSubmission";
			definition = "The report contains a baseline that is resubmitted.";
			owner_lazy = () -> ReportTypeCode.mmObject();
			codeName = "FWRE";
		}
	};
	/**
	 * The report contains a baseline that is amended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode
	 * ReportTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAmend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The report contains a baseline that is amended."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardAmend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardAmend";
			definition = "The report contains a baseline that is amended.";
			owner_lazy = () -> ReportTypeCode.mmObject();
			codeName = "FWAM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PREC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportTypeCode";
				definition = "Specifies the purpose of the report.";
				code_lazy = () -> Arrays.asList(ReportTypeCode.mmPrecalculated, ReportTypeCode.mmCurrent, ReportTypeCode.mmForwardInitialSubmission, ReportTypeCode.mmForwardReSubmission, ReportTypeCode.mmForwardAmend);
				derivation_lazy = () -> Arrays.asList(ReportType2Code.mmObject(), ReportType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}