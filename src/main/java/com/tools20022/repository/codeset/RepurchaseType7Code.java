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
import com.tools20022.repository.codeset.RepurchaseType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of repurchase transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#Swap
 * RepurchaseType7Code.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#RepurchaseCall
 * RepurchaseType7Code.RepurchaseCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#Pairoff
 * RepurchaseType7Code.Pairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#RepoRate
 * RepurchaseType7Code.RepoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#Rollover
 * RepurchaseType7Code.Rollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#TopUp
 * RepurchaseType7Code.TopUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#Withdrawal
 * RepurchaseType7Code.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code#PrincipalExposureAdjustment
 * RepurchaseType7Code.PrincipalExposureAdjustment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
 * RepurchaseTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CADJ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of repurchase transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepurchaseType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code Swap = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.Swap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCall"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code RepurchaseCall = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCall";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.RepurchaseCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code Pairoff = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.Pairoff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoRate"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code RepoRate = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.RepoRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code Rollover = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rollover";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.Rollover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUp"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code TopUp = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.TopUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code Withdrawal = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.Withdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType7Code
	 * RepurchaseType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalExposureAdjustment"</li>
	 * </ul>
	 */
	public static final RepurchaseType7Code PrincipalExposureAdjustment = new RepurchaseType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalExposureAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType7Code.mmObject();
			codeName = RepurchaseTypeCode.PrincipalExposureAdjustment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepurchaseType7Code> codesByName = new LinkedHashMap<>();

	protected RepurchaseType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CADJ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepurchaseType7Code";
				definition = "Specifies the type of repurchase transaction.";
				trace_lazy = () -> RepurchaseTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepurchaseType7Code.Swap, com.tools20022.repository.codeset.RepurchaseType7Code.RepurchaseCall,
						com.tools20022.repository.codeset.RepurchaseType7Code.Pairoff, com.tools20022.repository.codeset.RepurchaseType7Code.RepoRate, com.tools20022.repository.codeset.RepurchaseType7Code.Rollover,
						com.tools20022.repository.codeset.RepurchaseType7Code.TopUp, com.tools20022.repository.codeset.RepurchaseType7Code.Withdrawal, com.tools20022.repository.codeset.RepurchaseType7Code.PrincipalExposureAdjustment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(RepurchaseCall.getCodeName().get(), RepurchaseCall);
		codesByName.put(Pairoff.getCodeName().get(), Pairoff);
		codesByName.put(RepoRate.getCodeName().get(), RepoRate);
		codesByName.put(Rollover.getCodeName().get(), Rollover);
		codesByName.put(TopUp.getCodeName().get(), TopUp);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
		codesByName.put(PrincipalExposureAdjustment.getCodeName().get(), PrincipalExposureAdjustment);
	}

	public static RepurchaseType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepurchaseType7Code[] values() {
		RepurchaseType7Code[] values = new RepurchaseType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepurchaseType7Code> {
		@Override
		public RepurchaseType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepurchaseType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}