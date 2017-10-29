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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies what action needs to be taken by the validation service for this
 * particular record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#ContactCustodian
 * GCAActionTypeCode.ContactCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#ResearchRequired
 * GCAActionTypeCode.ResearchRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#CustodianContacted
 * GCAActionTypeCode.CustodianContacted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#DoNotContactCustodian
 * GCAActionTypeCode.DoNotContactCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#NoFurtherActionRequired
 * GCAActionTypeCode.NoFurtherActionRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#NotSupportedByGCA
 * GCAActionTypeCode.NotSupportedByGCA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GCAActionTypeCode#Invalid
 * GCAActionTypeCode.Invalid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.GCAActionType1Code
 * GCAActionType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RCON"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GCAActionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies what action needs to be taken by the validation service for this particular record."
 * </li>
 * </ul>
 */
public class GCAActionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Custodian needs to be contacted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian needs to be contacted."</li>
	 * </ul>
	 */
	public static final MMCode ContactCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactCustodian";
			definition = "Custodian needs to be contacted.";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "RCON";
		}
	};
	/**
	 * Further research is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResearchRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further research is required."</li>
	 * </ul>
	 */
	public static final MMCode ResearchRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResearchRequired";
			definition = "Further research is required.";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "FREA";
		}
	};
	/**
	 * Custodian has been contacted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianContacted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian has been contacted."</li>
	 * </ul>
	 */
	public static final MMCode CustodianContacted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianContacted";
			definition = "Custodian has been contacted.";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "CDCU";
		}
	};
	/**
	 * Custodian does not need to be contacted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NQCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotContactCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian does not need to be contacted."</li>
	 * </ul>
	 */
	public static final MMCode DoNotContactCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoNotContactCustodian";
			definition = "Custodian does not need to be contacted.";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "NQCU";
		}
	};
	/**
	 * No further action is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFurtherActionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No further action is required."</li>
	 * </ul>
	 */
	public static final MMCode NoFurtherActionRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFurtherActionRequired";
			definition = "No further action is required.";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "NFAC";
		}
	};
	/**
	 * Not supported by the GCA VA (Global Corporate Actions Validation
	 * service).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupportedByGCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not supported by the GCA VA (Global Corporate Actions Validation service)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NotSupportedByGCA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupportedByGCA";
			definition = "Not supported by the GCA VA (Global Corporate Actions Validation service).";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "NSUP";
		}
	};
	/**
	 * Invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionTypeCode
	 * GCAActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid."</li>
	 * </ul>
	 */
	public static final MMCode Invalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			definition = "Invalid.";
			owner_lazy = () -> GCAActionTypeCode.mmObject();
			codeName = "INVA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RCON");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GCAActionTypeCode";
				definition = "Specifies what action needs to be taken by the validation service for this particular record.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GCAActionTypeCode.ContactCustodian, com.tools20022.repository.codeset.GCAActionTypeCode.ResearchRequired,
						com.tools20022.repository.codeset.GCAActionTypeCode.CustodianContacted, com.tools20022.repository.codeset.GCAActionTypeCode.DoNotContactCustodian,
						com.tools20022.repository.codeset.GCAActionTypeCode.NoFurtherActionRequired, com.tools20022.repository.codeset.GCAActionTypeCode.NotSupportedByGCA, com.tools20022.repository.codeset.GCAActionTypeCode.Invalid);
				derivation_lazy = () -> Arrays.asList(GCAActionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}