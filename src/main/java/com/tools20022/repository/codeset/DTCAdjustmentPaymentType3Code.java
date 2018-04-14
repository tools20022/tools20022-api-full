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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#FailSettlement
 * DTCAdjustmentPaymentType3Code.FailSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#MiscellaneousSettlement
 * DTCAdjustmentPaymentType3Code.MiscellaneousSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#RepoSettlement
 * DTCAdjustmentPaymentType3Code.RepoSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#StockLoanSettlement
 * DTCAdjustmentPaymentType3Code.StockLoanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#ReorganisationDepositPhaseOne
 * DTCAdjustmentPaymentType3Code.ReorganisationDepositPhaseOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#ReorgDepositPhaseTwo
 * DTCAdjustmentPaymentType3Code.ReorgDepositPhaseTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#CustodyReorganizationDeposit
 * DTCAdjustmentPaymentType3Code.CustodyReorganizationDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code#DynamicRateChange
 * DTCAdjustmentPaymentType3Code.DynamicRateChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeV2Code
 * DTCAdjustmentPaymentTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the payment adjustment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code FailSettlement = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.FailSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code MiscellaneousSettlement = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.MiscellaneousSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code RepoSettlement = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.RepoSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code StockLoanSettlement = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.StockLoanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationDepositPhaseOne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code ReorganisationDepositPhaseOne = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationDepositPhaseOne";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ReorganisationDepositPhaseOne.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorgDepositPhaseTwo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code ReorgDepositPhaseTwo = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorgDepositPhaseTwo";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.ReorgDepositPhaseTwo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyReorganizationDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code CustodyReorganizationDeposit = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyReorganizationDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.CustodyReorganizationDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code
	 * DTCAdjustmentPaymentType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicRateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType3Code DynamicRateChange = new DTCAdjustmentPaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicRateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeV2Code.DynamicRateChange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentType3Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentType3Code";
				definition = "Specifies the type of the payment adjustment.";
				trace_lazy = () -> DTCAdjustmentPaymentTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.FailSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.MiscellaneousSettlement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.RepoSettlement, com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.StockLoanSettlement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.ReorganisationDepositPhaseOne, com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.ReorgDepositPhaseTwo,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.CustodyReorganizationDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentType3Code.DynamicRateChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FailSettlement.getCodeName().get(), FailSettlement);
		codesByName.put(MiscellaneousSettlement.getCodeName().get(), MiscellaneousSettlement);
		codesByName.put(RepoSettlement.getCodeName().get(), RepoSettlement);
		codesByName.put(StockLoanSettlement.getCodeName().get(), StockLoanSettlement);
		codesByName.put(ReorganisationDepositPhaseOne.getCodeName().get(), ReorganisationDepositPhaseOne);
		codesByName.put(ReorgDepositPhaseTwo.getCodeName().get(), ReorgDepositPhaseTwo);
		codesByName.put(CustodyReorganizationDeposit.getCodeName().get(), CustodyReorganizationDeposit);
		codesByName.put(DynamicRateChange.getCodeName().get(), DynamicRateChange);
	}

	public static DTCAdjustmentPaymentType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentType3Code[] values() {
		DTCAdjustmentPaymentType3Code[] values = new DTCAdjustmentPaymentType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentType3Code> {
		@Override
		public DTCAdjustmentPaymentType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}