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
import com.tools20022.repository.codeset.CorporateActionEventStage1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#Approved
 * CorporateActionEventStage1Code.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#Deactivated
 * CorporateActionEventStage1Code.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#ActionPeriod
 * CorporateActionEventStage1Code.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#SubjectToApproval
 * CorporateActionEventStage1Code.SubjectToApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#UnconditionalAsToAcceptance
 * CorporateActionEventStage1Code.UnconditionalAsToAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#WhollyUnconditional
 * CorporateActionEventStage1Code.WhollyUnconditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#FullReversalLotteryNotification
 * CorporateActionEventStage1Code.FullReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#Lapsed
 * CorporateActionEventStage1Code.Lapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#PartialReversalLotteryNotification
 * CorporateActionEventStage1Code.PartialReversalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code#RescissionReversalLotteryNotification
 * CorporateActionEventStage1Code.RescissionReversalLotteryNotification}</li>
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
 * <li>"APPD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStage1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the CA event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStage1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code Approved = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.Approved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code Deactivated = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.Deactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code ActionPeriod = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.ActionPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToApproval"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code SubjectToApproval = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectToApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.SubjectToApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalAsToAcceptance"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code UnconditionalAsToAcceptance = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalAsToAcceptance";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.UnconditionalAsToAcceptance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditional"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code WhollyUnconditional = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditional";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.WhollyUnconditional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullReversalLotteryNotification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code FullReversalLotteryNotification = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullReversalLotteryNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.FullReversalLotteryNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapsed"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code Lapsed = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapsed";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.Lapsed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialReversalLotteryNotification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code PartialReversalLotteryNotification = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReversalLotteryNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.PartialReversalLotteryNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage1Code
	 * CorporateActionEventStage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RescissionReversalLotteryNotification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage1Code RescissionReversalLotteryNotification = new CorporateActionEventStage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RescissionReversalLotteryNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage1Code.mmObject();
			codeName = CorporateActionEventStageCode.RescissionReversalLotteryNotification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStage1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStage1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("APPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStage1Code";
				definition = "Specifies the stage of the CA event.";
				trace_lazy = () -> CorporateActionEventStageCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStage1Code.Approved, com.tools20022.repository.codeset.CorporateActionEventStage1Code.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStage1Code.ActionPeriod, com.tools20022.repository.codeset.CorporateActionEventStage1Code.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStage1Code.UnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStage1Code.WhollyUnconditional,
						com.tools20022.repository.codeset.CorporateActionEventStage1Code.FullReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStage1Code.Lapsed,
						com.tools20022.repository.codeset.CorporateActionEventStage1Code.PartialReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStage1Code.RescissionReversalLotteryNotification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(ActionPeriod.getCodeName().get(), ActionPeriod);
		codesByName.put(SubjectToApproval.getCodeName().get(), SubjectToApproval);
		codesByName.put(UnconditionalAsToAcceptance.getCodeName().get(), UnconditionalAsToAcceptance);
		codesByName.put(WhollyUnconditional.getCodeName().get(), WhollyUnconditional);
		codesByName.put(FullReversalLotteryNotification.getCodeName().get(), FullReversalLotteryNotification);
		codesByName.put(Lapsed.getCodeName().get(), Lapsed);
		codesByName.put(PartialReversalLotteryNotification.getCodeName().get(), PartialReversalLotteryNotification);
		codesByName.put(RescissionReversalLotteryNotification.getCodeName().get(), RescissionReversalLotteryNotification);
	}

	public static CorporateActionEventStage1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStage1Code[] values() {
		CorporateActionEventStage1Code[] values = new CorporateActionEventStage1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStage1Code> {
		@Override
		public CorporateActionEventStage1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStage1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}