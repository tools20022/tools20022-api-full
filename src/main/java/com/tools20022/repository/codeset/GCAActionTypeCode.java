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
import com.tools20022.repository.codeset.GCAActionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GCAActionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies what action needs to be taken by the validation service for this particular record."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GCAActionTypeCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian needs to be contacted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode ContactCustodian = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactCustodian";
			definition = "Custodian needs to be contacted.";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResearchRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further research is required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode ResearchRequired = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResearchRequired";
			definition = "Further research is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianContacted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian has been contacted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode CustodianContacted = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianContacted";
			definition = "Custodian has been contacted.";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotContactCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian does not need to be contacted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode DoNotContactCustodian = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoNotContactCustodian";
			definition = "Custodian does not need to be contacted.";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFurtherActionRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No further action is required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode NoFurtherActionRequired = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFurtherActionRequired";
			definition = "No further action is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupportedByGCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not supported by the GCA VA (Global Corporate Actions Validation service)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode NotSupportedByGCA = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupportedByGCA";
			definition = "Not supported by the GCA VA (Global Corporate Actions Validation service).";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GCAActionTypeCode Invalid = new GCAActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			definition = "Invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.GCAActionTypeCode.mmObject();
			codeName = "INVA";
		}
	};
	final static private LinkedHashMap<String, GCAActionTypeCode> codesByName = new LinkedHashMap<>();

	protected GCAActionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RCON");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GCAActionTypeCode";
				definition = "Specifies what action needs to be taken by the validation service for this particular record.";
				derivation_lazy = () -> Arrays.asList(GCAActionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GCAActionTypeCode.ContactCustodian, com.tools20022.repository.codeset.GCAActionTypeCode.ResearchRequired,
						com.tools20022.repository.codeset.GCAActionTypeCode.CustodianContacted, com.tools20022.repository.codeset.GCAActionTypeCode.DoNotContactCustodian,
						com.tools20022.repository.codeset.GCAActionTypeCode.NoFurtherActionRequired, com.tools20022.repository.codeset.GCAActionTypeCode.NotSupportedByGCA, com.tools20022.repository.codeset.GCAActionTypeCode.Invalid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ContactCustodian.getCodeName().get(), ContactCustodian);
		codesByName.put(ResearchRequired.getCodeName().get(), ResearchRequired);
		codesByName.put(CustodianContacted.getCodeName().get(), CustodianContacted);
		codesByName.put(DoNotContactCustodian.getCodeName().get(), DoNotContactCustodian);
		codesByName.put(NoFurtherActionRequired.getCodeName().get(), NoFurtherActionRequired);
		codesByName.put(NotSupportedByGCA.getCodeName().get(), NotSupportedByGCA);
		codesByName.put(Invalid.getCodeName().get(), Invalid);
	}

	public static GCAActionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GCAActionTypeCode[] values() {
		GCAActionTypeCode[] values = new GCAActionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GCAActionTypeCode> {
		@Override
		public GCAActionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GCAActionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}