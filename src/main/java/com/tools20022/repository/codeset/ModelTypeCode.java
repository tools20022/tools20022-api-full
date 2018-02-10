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
import com.tools20022.repository.codeset.ModelTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Categorisation of margin models used by central counterparties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode#ExpectedShortfall
 * ModelTypeCode.ExpectedShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelTypeCode#Span
 * ModelTypeCode.Span}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelTypeCode#ValueAtRisk
 * ModelTypeCode.ValueAtRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode#OtherRiskAggregation
 * ModelTypeCode.OtherRiskAggregation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelTypeCode#Other
 * ModelTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelType1Code
 * ModelType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModelTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Categorisation of margin models used by central counterparties."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ModelTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Margin model used to calculate collateral requirements to cover potential
	 * future exposures whereby the model estimates the expected loss of a
	 * portfolio over a given holding period, or margin period of risk, to a set
	 * confidence interval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode
	 * ModelTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedShortfall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin model used to calculate collateral requirements to cover potential future exposures whereby the model estimates the expected loss of a portfolio over a given holding period, or margin period of risk, to a set confidence interval."
	 * </li>
	 * </ul>
	 */
	public static final ModelTypeCode ExpectedShortfall = new ModelTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedShortfall";
			definition = "Margin model used to calculate collateral requirements to cover potential future exposures whereby the model estimates the expected loss of a portfolio over a given holding period, or margin period of risk, to a set confidence interval.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelTypeCode.mmObject();
			codeName = "EXPS";
		}
	};
	/**
	 * Margin model used to calculate collateral requirements to cover potential
	 * future exposure developed by CME in the 1980s, or other derivatives
	 * thereof.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode
	 * ModelTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Span"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin model used to calculate collateral requirements to cover potential future exposure developed by CME in the 1980s, or other derivatives thereof."
	 * </li>
	 * </ul>
	 */
	public static final ModelTypeCode Span = new ModelTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Span";
			definition = "Margin model used to calculate collateral requirements to cover potential future exposure developed by CME in the 1980s, or other derivatives thereof.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelTypeCode.mmObject();
			codeName = "SPAN";
		}
	};
	/**
	 * Margin model used to calculate collateral requirements to cover potential
	 * future exposure whereby the model estimates the potential loss of a
	 * portfolio over a given holding period, or margin period of risk, to a
	 * given confidence interval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode
	 * ModelTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAtRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin model used to calculate collateral requirements to cover potential future exposure whereby the model estimates the potential loss of a portfolio over a given holding period, or margin period of risk, to a given confidence interval."
	 * </li>
	 * </ul>
	 */
	public static final ModelTypeCode ValueAtRisk = new ModelTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAtRisk";
			definition = "Margin model used to calculate collateral requirements to cover potential future exposure whereby the model estimates the potential loss of a portfolio over a given holding period, or margin period of risk, to a given confidence interval.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Margin model used to calculate collateral requirements where the total
	 * collateral requirement to cover potential future exposures for a
	 * portfolio is an aggregation of the estimated potential future exposure on
	 * each financial instrument of that portfolio. Such the methodology for
	 * such aggregation is defined explicitly by the model itself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode
	 * ModelTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRiskAggregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin model used to calculate collateral requirements where the total collateral requirement to cover potential future exposures for a portfolio is an aggregation of the estimated potential future exposure on each financial instrument of that portfolio. Such the methodology for such aggregation is defined explicitly by the model itself."
	 * </li>
	 * </ul>
	 */
	public static final ModelTypeCode OtherRiskAggregation = new ModelTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRiskAggregation";
			definition = "Margin model used to calculate collateral requirements where the total collateral requirement to cover potential future exposures for a portfolio is an aggregation of the estimated potential future exposure on each financial instrument of that portfolio. Such the methodology for such aggregation is defined explicitly by the model itself.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelTypeCode.mmObject();
			codeName = "ORIA";
		}
	};
	/**
	 * Margin model used to calculate collateral requirements to cover potential
	 * future exposures that is not classified by any other the model type code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode
	 * ModelTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin model used to calculate collateral requirements to cover potential future exposures that is not classified by any other the model type code."
	 * </li>
	 * </ul>
	 */
	public static final ModelTypeCode Other = new ModelTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Margin model used to calculate collateral requirements to cover potential future exposures that is not classified by any other the model type code.";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, ModelTypeCode> codesByName = new LinkedHashMap<>();

	protected ModelTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ModelTypeCode";
				definition = "Categorisation of margin models used by central counterparties.";
				derivation_lazy = () -> Arrays.asList(ModelType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModelTypeCode.ExpectedShortfall, com.tools20022.repository.codeset.ModelTypeCode.Span, com.tools20022.repository.codeset.ModelTypeCode.ValueAtRisk,
						com.tools20022.repository.codeset.ModelTypeCode.OtherRiskAggregation, com.tools20022.repository.codeset.ModelTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExpectedShortfall.getCodeName().get(), ExpectedShortfall);
		codesByName.put(Span.getCodeName().get(), Span);
		codesByName.put(ValueAtRisk.getCodeName().get(), ValueAtRisk);
		codesByName.put(OtherRiskAggregation.getCodeName().get(), OtherRiskAggregation);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static ModelTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ModelTypeCode[] values() {
		ModelTypeCode[] values = new ModelTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ModelTypeCode> {
		@Override
		public ModelTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ModelTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}