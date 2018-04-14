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
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities proceeds; whether they are newly issued or
 * not, defeased or non-defeased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#DefeasedSecurityIndicator
 * NewSecuritiesIssuanceType5Code.DefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#ExistingIssue
 * NewSecuritiesIssuanceType5Code.ExistingIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#NewIssue
 * NewSecuritiesIssuanceType5Code.NewIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#NonDefeasedSecurityIndicator
 * NewSecuritiesIssuanceType5Code.NonDefeasedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#Unknown
 * NewSecuritiesIssuanceType5Code.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#NonRefundedSecurityIndicator
 * NewSecuritiesIssuanceType5Code.NonRefundedSecurityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code#RefundedSecurityIndicator
 * NewSecuritiesIssuanceType5Code.RefundedSecurityIndicator}</li>
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
 * "NewSecuritiesIssuanceType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code
 * NewSecuritiesIssuanceType2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NewSecuritiesIssuanceType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#DefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType2Code.DefeasedSecurityIndicator}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code DefeasedSecurityIndicator = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefeasedSecurityIndicator";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType2Code.DefeasedSecurityIndicator;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.DefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExistingIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#ExistingIssue
	 * NewSecuritiesIssuanceType2Code.ExistingIssue}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code ExistingIssue = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExistingIssue";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType2Code.ExistingIssue;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.ExistingIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#NewIssue
	 * NewSecuritiesIssuanceType2Code.NewIssue}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code NewIssue = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssue";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType2Code.NewIssue;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NewIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDefeasedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#NonDefeasedSecurityIndicator
	 * NewSecuritiesIssuanceType2Code.NonDefeasedSecurityIndicator}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code NonDefeasedSecurityIndicator = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDefeasedSecurityIndicator";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType2Code.NonDefeasedSecurityIndicator;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NonDefeasedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType2Code#Unknown
	 * NewSecuritiesIssuanceType2Code.Unknown}</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code Unknown = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			previousVersion_lazy = () -> NewSecuritiesIssuanceType2Code.Unknown;
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.Unknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code NonRefundedSecurityIndicator = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundedSecurityIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.NonRefundedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedSecurityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NewSecuritiesIssuanceType5Code RefundedSecurityIndicator = new NewSecuritiesIssuanceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedSecurityIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.mmObject();
			codeName = NewSecuritiesIssuanceTypeCode.RefundedSecurityIndicator.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NewSecuritiesIssuanceType5Code> codesByName = new LinkedHashMap<>();

	protected NewSecuritiesIssuanceType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NewSecuritiesIssuanceType5Code";
				definition = "Specifies the type of securities proceeds; whether they are newly issued or not, defeased or non-defeased.";
				previousVersion_lazy = () -> NewSecuritiesIssuanceType2Code.mmObject();
				trace_lazy = () -> NewSecuritiesIssuanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.DefeasedSecurityIndicator, com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.ExistingIssue,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.NewIssue, com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.NonDefeasedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.Unknown, com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.NonRefundedSecurityIndicator,
						com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code.RefundedSecurityIndicator);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DefeasedSecurityIndicator.getCodeName().get(), DefeasedSecurityIndicator);
		codesByName.put(ExistingIssue.getCodeName().get(), ExistingIssue);
		codesByName.put(NewIssue.getCodeName().get(), NewIssue);
		codesByName.put(NonDefeasedSecurityIndicator.getCodeName().get(), NonDefeasedSecurityIndicator);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(NonRefundedSecurityIndicator.getCodeName().get(), NonRefundedSecurityIndicator);
		codesByName.put(RefundedSecurityIndicator.getCodeName().get(), RefundedSecurityIndicator);
	}

	public static NewSecuritiesIssuanceType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NewSecuritiesIssuanceType5Code[] values() {
		NewSecuritiesIssuanceType5Code[] values = new NewSecuritiesIssuanceType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NewSecuritiesIssuanceType5Code> {
		@Override
		public NewSecuritiesIssuanceType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NewSecuritiesIssuanceType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}