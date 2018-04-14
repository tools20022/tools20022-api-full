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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettlementInstructionModeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the mode used for settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#Default
 * SettlementInstructionModeCode.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#StandingInstruction
 * SettlementInstructionModeCode.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#AllocationAccountOverriding
 * SettlementInstructionModeCode.AllocationAccountOverriding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#AllocationAccountStanding
 * SettlementInstructionModeCode.AllocationAccountStanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode#CIVSingleAccount
 * SettlementInstructionModeCode.CIVSingleAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionModeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the mode used for settlement."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: FIX 160</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DFLT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementInstructionModeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement takes place according to the standard market rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the standard market rules."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 160</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionModeCode Default = new SettlementInstructionModeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 160"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Default";
			definition = "Settlement takes place according to the standard market rules.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionModeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Settlement takes place according to the standing instructions provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the standing instructions provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 160</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionModeCode StandingInstruction = new SettlementInstructionModeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 160"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "StandingInstruction";
			definition = "Settlement takes place according to the standing instructions provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionModeCode.mmObject();
			codeName = "STIN";
		}
	};
	/**
	 * Settlement takes place according to the allocation account details
	 * provided, and is therefore overriding the standing allocation account
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALOO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccountOverriding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the allocation account details provided, and is therefore overriding the standing allocation account details."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 160</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionModeCode AllocationAccountOverriding = new SettlementInstructionModeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 160"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "AllocationAccountOverriding";
			definition = "Settlement takes place according to the allocation account details provided, and is therefore overriding the standing allocation account details.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionModeCode.mmObject();
			codeName = "ALOO";
		}
	};
	/**
	 * Settlement takes place according to the standing allocation account
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALOS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccountStanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place according to the standing allocation account details."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 160</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionModeCode AllocationAccountStanding = new SettlementInstructionModeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 160"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "AllocationAccountStanding";
			definition = "Settlement takes place according to the standing allocation account details.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionModeCode.mmObject();
			codeName = "ALOS";
		}
	};
	/**
	 * Settlement takes place using the single account of the collective
	 * investment vehicle (CIV).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionModeCode
	 * SettlementInstructionModeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIVS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CIVSingleAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place using the single account of the collective investment vehicle (CIV)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: FIX 160</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final SettlementInstructionModeCode CIVSingleAccount = new SettlementInstructionModeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 160"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CIVSingleAccount";
			definition = "Settlement takes place using the single account of the collective investment vehicle (CIV).";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionModeCode.mmObject();
			codeName = "CIVS";
		}
	};
	final static private LinkedHashMap<String, SettlementInstructionModeCode> codesByName = new LinkedHashMap<>();

	protected SettlementInstructionModeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FIX 160"));
				example = Arrays.asList("DFLT");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "SettlementInstructionModeCode";
				definition = "Specifies the mode used for settlement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionModeCode.Default, com.tools20022.repository.codeset.SettlementInstructionModeCode.StandingInstruction,
						com.tools20022.repository.codeset.SettlementInstructionModeCode.AllocationAccountOverriding, com.tools20022.repository.codeset.SettlementInstructionModeCode.AllocationAccountStanding,
						com.tools20022.repository.codeset.SettlementInstructionModeCode.CIVSingleAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(StandingInstruction.getCodeName().get(), StandingInstruction);
		codesByName.put(AllocationAccountOverriding.getCodeName().get(), AllocationAccountOverriding);
		codesByName.put(AllocationAccountStanding.getCodeName().get(), AllocationAccountStanding);
		codesByName.put(CIVSingleAccount.getCodeName().get(), CIVSingleAccount);
	}

	public static SettlementInstructionModeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementInstructionModeCode[] values() {
		SettlementInstructionModeCode[] values = new SettlementInstructionModeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementInstructionModeCode> {
		@Override
		public SettlementInstructionModeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementInstructionModeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}