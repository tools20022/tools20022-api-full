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
import com.tools20022.repository.codeset.ModelType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ModelType1Code#ExpectedShortfall
 * ModelType1Code.ExpectedShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelType1Code#Other
 * ModelType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModelType1Code#OtherRiskAggregation
 * ModelType1Code.OtherRiskAggregation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelType1Code#Span
 * ModelType1Code.Span}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ModelType1Code#ValueAtRisk
 * ModelType1Code.ValueAtRisk}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ModelTypeCode ModelTypeCode}</li>
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
 * "ModelType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Categorisation of margin models used by central counterparties."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ModelType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelType1Code
	 * ModelType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedShortfall"</li>
	 * </ul>
	 */
	public static final ModelType1Code ExpectedShortfall = new ModelType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedShortfall";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelType1Code.mmObject();
			codeName = ModelTypeCode.ExpectedShortfall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelType1Code
	 * ModelType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final ModelType1Code Other = new ModelType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelType1Code.mmObject();
			codeName = ModelTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelType1Code
	 * ModelType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRiskAggregation"</li>
	 * </ul>
	 */
	public static final ModelType1Code OtherRiskAggregation = new ModelType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRiskAggregation";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelType1Code.mmObject();
			codeName = ModelTypeCode.OtherRiskAggregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelType1Code
	 * ModelType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Span"</li>
	 * </ul>
	 */
	public static final ModelType1Code Span = new ModelType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Span";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelType1Code.mmObject();
			codeName = ModelTypeCode.Span.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModelType1Code
	 * ModelType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAtRisk"</li>
	 * </ul>
	 */
	public static final ModelType1Code ValueAtRisk = new ModelType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAtRisk";
			owner_lazy = () -> com.tools20022.repository.codeset.ModelType1Code.mmObject();
			codeName = ModelTypeCode.ValueAtRisk.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ModelType1Code> codesByName = new LinkedHashMap<>();

	protected ModelType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ModelType1Code";
				definition = "Categorisation of margin models used by central counterparties.";
				trace_lazy = () -> ModelTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModelType1Code.ExpectedShortfall, com.tools20022.repository.codeset.ModelType1Code.Other,
						com.tools20022.repository.codeset.ModelType1Code.OtherRiskAggregation, com.tools20022.repository.codeset.ModelType1Code.Span, com.tools20022.repository.codeset.ModelType1Code.ValueAtRisk);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExpectedShortfall.getCodeName().get(), ExpectedShortfall);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(OtherRiskAggregation.getCodeName().get(), OtherRiskAggregation);
		codesByName.put(Span.getCodeName().get(), Span);
		codesByName.put(ValueAtRisk.getCodeName().get(), ValueAtRisk);
	}

	public static ModelType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ModelType1Code[] values() {
		ModelType1Code[] values = new ModelType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ModelType1Code> {
		@Override
		public ModelType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ModelType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}