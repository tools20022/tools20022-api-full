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
import com.tools20022.repository.codeset.BusinessProcessType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of business process model used to carry out the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#TripartiteCentralMatching
 * BusinessProcessType1Code.TripartiteCentralMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#NotCoveredByInvestmentInstructions
 * BusinessProcessType1Code.NotCoveredByInvestmentInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#PreAccepted
 * BusinessProcessType1Code.PreAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#Reversal
 * BusinessProcessType1Code.Reversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#OwnAccountTradeType
 * BusinessProcessType1Code.OwnAccountTradeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#ThroughType
 * BusinessProcessType1Code.ThroughType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#BillateralCentralMatching
 * BusinessProcessType1Code.BillateralCentralMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code#DuplexType
 * BusinessProcessType1Code.DuplexType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BusinessProcessTypeCode
 * BusinessProcessTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ISUP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessProcessType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of business process model used to carry out the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BusinessProcessType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartiteCentralMatching"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code TripartiteCentralMatching = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartiteCentralMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.TripartiteCentralMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCoveredByInvestmentInstructions"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code NotCoveredByInvestmentInstructions = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCoveredByInvestmentInstructions";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.NotCoveredByInvestmentInstructions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAccepted"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code PreAccepted = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.PreAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code Reversal = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.Reversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTradeType"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code OwnAccountTradeType = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTradeType";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.OwnAccountTradeType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThroughType"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code ThroughType = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughType";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.ThroughType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillateralCentralMatching"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code BillateralCentralMatching = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillateralCentralMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.BillateralCentralMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessProcessType1Code
	 * BusinessProcessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplexType"</li>
	 * </ul>
	 */
	public static final BusinessProcessType1Code DuplexType = new BusinessProcessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplexType";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessProcessType1Code.mmObject();
			codeName = BusinessProcessTypeCode.DuplexType.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BusinessProcessType1Code> codesByName = new LinkedHashMap<>();

	protected BusinessProcessType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ISUP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessProcessType1Code";
				definition = "Type of business process model used to carry out the transaction.";
				trace_lazy = () -> BusinessProcessTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessProcessType1Code.TripartiteCentralMatching, com.tools20022.repository.codeset.BusinessProcessType1Code.NotCoveredByInvestmentInstructions,
						com.tools20022.repository.codeset.BusinessProcessType1Code.PreAccepted, com.tools20022.repository.codeset.BusinessProcessType1Code.Reversal,
						com.tools20022.repository.codeset.BusinessProcessType1Code.OwnAccountTradeType, com.tools20022.repository.codeset.BusinessProcessType1Code.ThroughType,
						com.tools20022.repository.codeset.BusinessProcessType1Code.BillateralCentralMatching, com.tools20022.repository.codeset.BusinessProcessType1Code.DuplexType);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TripartiteCentralMatching.getCodeName().get(), TripartiteCentralMatching);
		codesByName.put(NotCoveredByInvestmentInstructions.getCodeName().get(), NotCoveredByInvestmentInstructions);
		codesByName.put(PreAccepted.getCodeName().get(), PreAccepted);
		codesByName.put(Reversal.getCodeName().get(), Reversal);
		codesByName.put(OwnAccountTradeType.getCodeName().get(), OwnAccountTradeType);
		codesByName.put(ThroughType.getCodeName().get(), ThroughType);
		codesByName.put(BillateralCentralMatching.getCodeName().get(), BillateralCentralMatching);
		codesByName.put(DuplexType.getCodeName().get(), DuplexType);
	}

	public static BusinessProcessType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BusinessProcessType1Code[] values() {
		BusinessProcessType1Code[] values = new BusinessProcessType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BusinessProcessType1Code> {
		@Override
		public BusinessProcessType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BusinessProcessType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}