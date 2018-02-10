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
import com.tools20022.repository.codeset.CorporateActionEventStage2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the stage of the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#ActionPeriod
 * CorporateActionEventStage2Code.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#SubjectToApproval
 * CorporateActionEventStage2Code.SubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#Approved
 * CorporateActionEventStage2Code.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#UnconditionalAsToAcceptance
 * CorporateActionEventStage2Code.UnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#WhollyUnconditional
 * CorporateActionEventStage2Code.WhollyUnconditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#Deactivated
 * CorporateActionEventStage2Code.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code#Lapsed
 * CorporateActionEventStage2Code.Lapsed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageCode
 * CorporateActionEventStageCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PWAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStage2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the corporate action event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStage2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code ActionPeriod = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.ActionPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToApproval"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code SubjectToApproval = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.SubjectToApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code Approved = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.Approved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalAsToAcceptance"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code UnconditionalAsToAcceptance = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalAsToAcceptance";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.UnconditionalAsToAcceptance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditional"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code WhollyUnconditional = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditional";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.WhollyUnconditional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code Deactivated = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.Deactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage2Code
	 * CorporateActionEventStage2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapsed"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage2Code Lapsed = new CorporateActionEventStage2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapsed";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage2Code.mmObject();
			codeName = CorporateActionEventStageCode.Lapsed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStage2Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStage2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PWAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStage2Code";
				definition = "Specifies the stage of the corporate action event.";
				trace_lazy = () -> CorporateActionEventStageCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStage2Code.ActionPeriod, com.tools20022.repository.codeset.CorporateActionEventStage2Code.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStage2Code.Approved, com.tools20022.repository.codeset.CorporateActionEventStage2Code.UnconditionalAsToAcceptance,
						com.tools20022.repository.codeset.CorporateActionEventStage2Code.WhollyUnconditional, com.tools20022.repository.codeset.CorporateActionEventStage2Code.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStage2Code.Lapsed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActionPeriod.getCodeName().get(), ActionPeriod);
		codesByName.put(SubjectToApproval.getCodeName().get(), SubjectToApproval);
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(UnconditionalAsToAcceptance.getCodeName().get(), UnconditionalAsToAcceptance);
		codesByName.put(WhollyUnconditional.getCodeName().get(), WhollyUnconditional);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(Lapsed.getCodeName().get(), Lapsed);
	}

	public static CorporateActionEventStage2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStage2Code[] values() {
		CorporateActionEventStage2Code[] values = new CorporateActionEventStage2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStage2Code> {
		@Override
		public CorporateActionEventStage2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStage2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}