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
import com.tools20022.repository.codeset.DisputeResolutionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the disputed collateral amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code#ReconcileCollateral
 * DisputeResolutionType1Code.ReconcileCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code#ReconcileMinimumTransferAmount
 * DisputeResolutionType1Code.ReconcileMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code#ReconcileRounding
 * DisputeResolutionType1Code.ReconcileRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code#ReconcileValuationFrequency
 * DisputeResolutionType1Code.ReconcileValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code#ReconcileSegregatedIndependentAmount
 * DisputeResolutionType1Code.ReconcileSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
 * DisputeResolutionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RECO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisputeResolutionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the disputed collateral amount."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DisputeResolutionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code
	 * DisputeResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileCollateral"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType1Code ReconcileCollateral = new DisputeResolutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType1Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code
	 * DisputeResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileMinimumTransferAmount"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType1Code ReconcileMinimumTransferAmount = new DisputeResolutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileMinimumTransferAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType1Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileMinimumTransferAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code
	 * DisputeResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileRounding"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType1Code ReconcileRounding = new DisputeResolutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileRounding";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType1Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileRounding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code
	 * DisputeResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileValuationFrequency"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType1Code ReconcileValuationFrequency = new DisputeResolutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileValuationFrequency";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType1Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileValuationFrequency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code
	 * DisputeResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileSegregatedIndependentAmount"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType1Code ReconcileSegregatedIndependentAmount = new DisputeResolutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileSegregatedIndependentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType1Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileSegregatedIndependentAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DisputeResolutionType1Code> codesByName = new LinkedHashMap<>();

	protected DisputeResolutionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeResolutionType1Code";
				definition = "Specifies the nature of the disputed collateral amount.";
				trace_lazy = () -> DisputeResolutionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisputeResolutionType1Code.ReconcileCollateral, com.tools20022.repository.codeset.DisputeResolutionType1Code.ReconcileMinimumTransferAmount,
						com.tools20022.repository.codeset.DisputeResolutionType1Code.ReconcileRounding, com.tools20022.repository.codeset.DisputeResolutionType1Code.ReconcileValuationFrequency,
						com.tools20022.repository.codeset.DisputeResolutionType1Code.ReconcileSegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReconcileCollateral.getCodeName().get(), ReconcileCollateral);
		codesByName.put(ReconcileMinimumTransferAmount.getCodeName().get(), ReconcileMinimumTransferAmount);
		codesByName.put(ReconcileRounding.getCodeName().get(), ReconcileRounding);
		codesByName.put(ReconcileValuationFrequency.getCodeName().get(), ReconcileValuationFrequency);
		codesByName.put(ReconcileSegregatedIndependentAmount.getCodeName().get(), ReconcileSegregatedIndependentAmount);
	}

	public static DisputeResolutionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DisputeResolutionType1Code[] values() {
		DisputeResolutionType1Code[] values = new DisputeResolutionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DisputeResolutionType1Code> {
		@Override
		public DisputeResolutionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DisputeResolutionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}