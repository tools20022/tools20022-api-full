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
import com.tools20022.repository.codeset.ReinvestmentPlan1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the specific reinvestment plan type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code#ForRetailInvestorsOnly
 * ReinvestmentPlan1Code.ForRetailInvestorsOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code#FullReinvestmentPlanOffered
 * ReinvestmentPlan1Code.FullReinvestmentPlanOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code#SubjectToShareholderApproval
 * ReinvestmentPlan1Code.SubjectToShareholderApproval}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlanCode
 * ReinvestmentPlanCode}</li>
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
 * "ReinvestmentPlan1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the specific reinvestment plan type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReinvestmentPlan1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code
	 * ReinvestmentPlan1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForRetailInvestorsOnly"</li>
	 * </ul>
	 */
	public static final ReinvestmentPlan1Code ForRetailInvestorsOnly = new ReinvestmentPlan1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForRetailInvestorsOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentPlan1Code.mmObject();
			codeName = ReinvestmentPlanCode.ForRetailInvestorsOnly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code
	 * ReinvestmentPlan1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullReinvestmentPlanOffered"</li>
	 * </ul>
	 */
	public static final ReinvestmentPlan1Code FullReinvestmentPlanOffered = new ReinvestmentPlan1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullReinvestmentPlanOffered";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentPlan1Code.mmObject();
			codeName = ReinvestmentPlanCode.FullReinvestmentPlanOffered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentPlan1Code
	 * ReinvestmentPlan1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToShareholderApproval"</li>
	 * </ul>
	 */
	public static final ReinvestmentPlan1Code SubjectToShareholderApproval = new ReinvestmentPlan1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToShareholderApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentPlan1Code.mmObject();
			codeName = ReinvestmentPlanCode.SubjectToShareholderApproval.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReinvestmentPlan1Code> codesByName = new LinkedHashMap<>();

	protected ReinvestmentPlan1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReinvestmentPlan1Code";
				definition = "Indicates the specific reinvestment plan type.";
				trace_lazy = () -> ReinvestmentPlanCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReinvestmentPlan1Code.ForRetailInvestorsOnly, com.tools20022.repository.codeset.ReinvestmentPlan1Code.FullReinvestmentPlanOffered,
						com.tools20022.repository.codeset.ReinvestmentPlan1Code.SubjectToShareholderApproval);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForRetailInvestorsOnly.getCodeName().get(), ForRetailInvestorsOnly);
		codesByName.put(FullReinvestmentPlanOffered.getCodeName().get(), FullReinvestmentPlanOffered);
		codesByName.put(SubjectToShareholderApproval.getCodeName().get(), SubjectToShareholderApproval);
	}

	public static ReinvestmentPlan1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReinvestmentPlan1Code[] values() {
		ReinvestmentPlan1Code[] values = new ReinvestmentPlan1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReinvestmentPlan1Code> {
		@Override
		public ReinvestmentPlan1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReinvestmentPlan1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}