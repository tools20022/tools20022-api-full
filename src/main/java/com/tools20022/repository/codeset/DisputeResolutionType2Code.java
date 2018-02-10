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
import com.tools20022.repository.codeset.DisputeResolutionType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileCollateral
 * DisputeResolutionType2Code.ReconcileCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileExposure
 * DisputeResolutionType2Code.ReconcileExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileThreshold
 * DisputeResolutionType2Code.ReconcileThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileMinimumTransferAmount
 * DisputeResolutionType2Code.ReconcileMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileRounding
 * DisputeResolutionType2Code.ReconcileRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileValuationFrequency
 * DisputeResolutionType2Code.ReconcileValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#ReconcileNettedIndependentAmount
 * DisputeResolutionType2Code.ReconcileNettedIndependentAmount}</li>
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
 * "DisputeResolutionType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the disputed collateral amount."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DisputeResolutionType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileCollateral"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileCollateral = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileExposure"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileExposure = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileExposure";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileExposure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileThreshold"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileThreshold = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileThreshold";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileThreshold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileMinimumTransferAmount"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileMinimumTransferAmount = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileMinimumTransferAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileMinimumTransferAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileRounding"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileRounding = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileRounding";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileRounding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileValuationFrequency"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileValuationFrequency = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileValuationFrequency";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileValuationFrequency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileNettedIndependentAmount"</li>
	 * </ul>
	 */
	public static final DisputeResolutionType2Code ReconcileNettedIndependentAmount = new DisputeResolutionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileNettedIndependentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DisputeResolutionType2Code.mmObject();
			codeName = DisputeResolutionTypeCode.ReconcileNettedIndependentAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DisputeResolutionType2Code> codesByName = new LinkedHashMap<>();

	protected DisputeResolutionType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeResolutionType2Code";
				definition = "Specifies the nature of the disputed collateral amount.";
				trace_lazy = () -> DisputeResolutionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileCollateral, com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileExposure,
						com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileThreshold, com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileMinimumTransferAmount,
						com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileRounding, com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileValuationFrequency,
						com.tools20022.repository.codeset.DisputeResolutionType2Code.ReconcileNettedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReconcileCollateral.getCodeName().get(), ReconcileCollateral);
		codesByName.put(ReconcileExposure.getCodeName().get(), ReconcileExposure);
		codesByName.put(ReconcileThreshold.getCodeName().get(), ReconcileThreshold);
		codesByName.put(ReconcileMinimumTransferAmount.getCodeName().get(), ReconcileMinimumTransferAmount);
		codesByName.put(ReconcileRounding.getCodeName().get(), ReconcileRounding);
		codesByName.put(ReconcileValuationFrequency.getCodeName().get(), ReconcileValuationFrequency);
		codesByName.put(ReconcileNettedIndependentAmount.getCodeName().get(), ReconcileNettedIndependentAmount);
	}

	public static DisputeResolutionType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DisputeResolutionType2Code[] values() {
		DisputeResolutionType2Code[] values = new DisputeResolutionType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DisputeResolutionType2Code> {
		@Override
		public DisputeResolutionType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DisputeResolutionType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}