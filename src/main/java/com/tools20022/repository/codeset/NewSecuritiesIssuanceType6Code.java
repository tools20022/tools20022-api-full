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
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities proceeds; whether they are defeased or
 * non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#DefeasedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.DefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#NonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.NonDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#RefundedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.RefundedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code#NonRefundedSecurityIndicator
 * NewSecuritiesIssuanceType6Code.NonRefundedSecurityIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceTypeCode
 * NewSecuritiesIssuanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewSecuritiesIssuanceType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are defeased or non-defeased."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code
 * NewSecuritiesIssuanceType3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NewSecuritiesIssuanceType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code#DefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType3Code.DefeasedSecurityIndicator}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType6Code DefeasedSecurityIndicator = new NewSecuritiesIssuanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType3Code.DefeasedSecurityIndicator;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.DefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType3Code#NonDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType3Code.NonDefeasedSecurityIndicator}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType6Code NonDefeasedSecurityIndicator = new NewSecuritiesIssuanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType3Code.NonDefeasedSecurityIndicator;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NonDefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType6Code RefundedSecurityIndicator = new NewSecuritiesIssuanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedSecurityIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.RefundedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code
	 * NewSecuritiesIssuanceType6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType6Code NonRefundedSecurityIndicator = new NewSecuritiesIssuanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundedSecurityIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NonRefundedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NewSecuritiesIssuanceType6Code> codesByName = new LinkedHashMap<>();

	protected NewSecuritiesIssuanceType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType6Code";
				definition = "Specifies the type of securities proceeds; whether they are defeased or non-defeased.";
				previousVersion_lazy = () -> NewSecuritiesIssuanceType3Code.mmObject();
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.DefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.NonDefeasedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.RefundedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType6Code.NonRefundedSecurityIndicator);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DefeasedSecurityIndicator.getCodeName().get(), DefeasedSecurityIndicator);
		codesByName.put(NonDefeasedSecurityIndicator.getCodeName().get(), NonDefeasedSecurityIndicator);
		codesByName.put(RefundedSecurityIndicator.getCodeName().get(), RefundedSecurityIndicator);
		codesByName.put(NonRefundedSecurityIndicator.getCodeName().get(), NonRefundedSecurityIndicator);
	}

	public static NewSecuritiesIssuanceType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NewSecuritiesIssuanceType6Code[] values() {
		NewSecuritiesIssuanceType6Code[] values = new NewSecuritiesIssuanceType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NewSecuritiesIssuanceType6Code> {
		@Override
		public NewSecuritiesIssuanceType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NewSecuritiesIssuanceType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}