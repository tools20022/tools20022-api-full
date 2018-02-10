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
import com.tools20022.repository.codeset.CollateralProposalResponse1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the collateral proposal response is an initial or a counter
 * proposal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponse1Code#InitialProposal
 * CollateralProposalResponse1Code.InitialProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponse1Code#CounterProposal
 * CollateralProposalResponse1Code.CounterProposal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode
 * CollateralProposalResponseCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposalResponse1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the collateral proposal response is an initial or a counter proposal."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralProposalResponse1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponse1Code
	 * CollateralProposalResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialProposal"</li>
	 * </ul>
	 */
	public static final CollateralProposalResponse1Code InitialProposal = new CollateralProposalResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialProposal";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralProposalResponse1Code.mmObject();
			codeName = CollateralProposalResponseCode.InitialProposal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponse1Code
	 * CollateralProposalResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterProposal"</li>
	 * </ul>
	 */
	public static final CollateralProposalResponse1Code CounterProposal = new CollateralProposalResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterProposal";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralProposalResponse1Code.mmObject();
			codeName = CollateralProposalResponseCode.CounterProposal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralProposalResponse1Code> codesByName = new LinkedHashMap<>();

	protected CollateralProposalResponse1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponse1Code";
				definition = "Specifies if the collateral proposal response is an initial or a counter proposal.";
				trace_lazy = () -> CollateralProposalResponseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralProposalResponse1Code.InitialProposal, com.tools20022.repository.codeset.CollateralProposalResponse1Code.CounterProposal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InitialProposal.getCodeName().get(), InitialProposal);
		codesByName.put(CounterProposal.getCodeName().get(), CounterProposal);
	}

	public static CollateralProposalResponse1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralProposalResponse1Code[] values() {
		CollateralProposalResponse1Code[] values = new CollateralProposalResponse1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralProposalResponse1Code> {
		@Override
		public CollateralProposalResponse1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralProposalResponse1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}