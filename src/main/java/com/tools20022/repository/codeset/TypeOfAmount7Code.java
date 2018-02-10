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
import com.tools20022.repository.codeset.TypeOfAmount7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type or class of amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code#Fees
 * TypeOfAmount7Code.Fees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code#IssuerFees
 * TypeOfAmount7Code.IssuerFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code#InterchangeFees
 * TypeOfAmount7Code.InterchangeFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code#ProcessingFees
 * TypeOfAmount7Code.ProcessingFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code#InternationalServiceAssessmentFees
 * TypeOfAmount7Code.InternationalServiceAssessmentFees}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
 * TypeOfAmountCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfAmount7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type or class of amount."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfAmount7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code
	 * TypeOfAmount7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount7Code Fees = new TypeOfAmount7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount7Code.mmObject();
			codeName = TypeOfAmountCode.Fees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code
	 * TypeOfAmount7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount7Code IssuerFees = new TypeOfAmount7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount7Code.mmObject();
			codeName = TypeOfAmountCode.IssuerFees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code
	 * TypeOfAmount7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeFees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount7Code InterchangeFees = new TypeOfAmount7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterchangeFees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount7Code.mmObject();
			codeName = TypeOfAmountCode.InterchangeFees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code
	 * TypeOfAmount7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingFees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount7Code ProcessingFees = new TypeOfAmount7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingFees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount7Code.mmObject();
			codeName = TypeOfAmountCode.ProcessingFees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code
	 * TypeOfAmount7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalServiceAssessmentFees"</li>
	 * </ul>
	 */
	public static final TypeOfAmount7Code InternationalServiceAssessmentFees = new TypeOfAmount7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalServiceAssessmentFees";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount7Code.mmObject();
			codeName = TypeOfAmountCode.InternationalServiceAssessmentFees.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfAmount7Code> codesByName = new LinkedHashMap<>();

	protected TypeOfAmount7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmount7Code";
				definition = "Type or class of amount.";
				trace_lazy = () -> TypeOfAmountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmount7Code.Fees, com.tools20022.repository.codeset.TypeOfAmount7Code.IssuerFees, com.tools20022.repository.codeset.TypeOfAmount7Code.InterchangeFees,
						com.tools20022.repository.codeset.TypeOfAmount7Code.ProcessingFees, com.tools20022.repository.codeset.TypeOfAmount7Code.InternationalServiceAssessmentFees);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fees.getCodeName().get(), Fees);
		codesByName.put(IssuerFees.getCodeName().get(), IssuerFees);
		codesByName.put(InterchangeFees.getCodeName().get(), InterchangeFees);
		codesByName.put(ProcessingFees.getCodeName().get(), ProcessingFees);
		codesByName.put(InternationalServiceAssessmentFees.getCodeName().get(), InternationalServiceAssessmentFees);
	}

	public static TypeOfAmount7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfAmount7Code[] values() {
		TypeOfAmount7Code[] values = new TypeOfAmount7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfAmount7Code> {
		@Override
		public TypeOfAmount7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfAmount7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}