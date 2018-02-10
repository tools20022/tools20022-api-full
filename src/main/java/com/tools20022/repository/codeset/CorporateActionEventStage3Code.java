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
import com.tools20022.repository.codeset.CorporateActionEventStage3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the stage of the CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#Approved
 * CorporateActionEventStage3Code.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#Deactivated
 * CorporateActionEventStage3Code.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#CancellationAndReRun
 * CorporateActionEventStage3Code.CancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#Lapsed
 * CorporateActionEventStage3Code.Lapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#SupplementalCancellationAndReRun
 * CorporateActionEventStage3Code.SupplementalCancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#ActionPeriod
 * CorporateActionEventStage3Code.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#SupplementalCancellation
 * CorporateActionEventStage3Code.SupplementalCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#SubjectToApproval
 * CorporateActionEventStage3Code.SubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#UnconditionalAsToAcceptance
 * CorporateActionEventStage3Code.UnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code#WhollyUnconditional
 * CorporateActionEventStage3Code.WhollyUnconditional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
 * CorporateActionEventStageV2Code}</li>
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
 * "CorporateActionEventStage3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the CA event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStage3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code Approved = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.Approved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code Deactivated = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.Deactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAndReRun"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code CancellationAndReRun = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAndReRun";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.CancellationAndReRun.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapsed"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code Lapsed = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapsed";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.Lapsed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalCancellationAndReRun"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code SupplementalCancellationAndReRun = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellationAndReRun";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.SupplementalCancellationAndReRun.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code ActionPeriod = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.ActionPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalCancellation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code SupplementalCancellation = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.SupplementalCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToApproval"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code SubjectToApproval = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.SubjectToApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalAsToAcceptance"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code UnconditionalAsToAcceptance = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalAsToAcceptance";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.UnconditionalAsToAcceptance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage3Code
	 * CorporateActionEventStage3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditional"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage3Code WhollyUnconditional = new CorporateActionEventStage3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditional";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage3Code.mmObject();
			codeName = CorporateActionEventStageV2Code.WhollyUnconditional.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStage3Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStage3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStage3Code";
				definition = "Specifies the stage of the CA event.";
				trace_lazy = () -> CorporateActionEventStageV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStage3Code.Approved, com.tools20022.repository.codeset.CorporateActionEventStage3Code.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStage3Code.CancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStage3Code.Lapsed,
						com.tools20022.repository.codeset.CorporateActionEventStage3Code.SupplementalCancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStage3Code.ActionPeriod,
						com.tools20022.repository.codeset.CorporateActionEventStage3Code.SupplementalCancellation, com.tools20022.repository.codeset.CorporateActionEventStage3Code.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStage3Code.UnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStage3Code.WhollyUnconditional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(CancellationAndReRun.getCodeName().get(), CancellationAndReRun);
		codesByName.put(Lapsed.getCodeName().get(), Lapsed);
		codesByName.put(SupplementalCancellationAndReRun.getCodeName().get(), SupplementalCancellationAndReRun);
		codesByName.put(ActionPeriod.getCodeName().get(), ActionPeriod);
		codesByName.put(SupplementalCancellation.getCodeName().get(), SupplementalCancellation);
		codesByName.put(SubjectToApproval.getCodeName().get(), SubjectToApproval);
		codesByName.put(UnconditionalAsToAcceptance.getCodeName().get(), UnconditionalAsToAcceptance);
		codesByName.put(WhollyUnconditional.getCodeName().get(), WhollyUnconditional);
	}

	public static CorporateActionEventStage3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStage3Code[] values() {
		CorporateActionEventStage3Code[] values = new CorporateActionEventStage3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStage3Code> {
		@Override
		public CorporateActionEventStage3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStage3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}